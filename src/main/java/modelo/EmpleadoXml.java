/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daw1
 */
public class EmpleadoXml implements EmpleadoDao{
    private Path path;
    public EmpleadoXml(String path) {
        this.path = Paths.get(path);
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }
    @Override
    public List<Empleado> listar() throws DaoException {
        List<Empleado> empelados=new ArrayList<>();
        return empelados;    
    }

    @Override
    public int insertar(List<Empleado> listado) throws DaoException {
        int n=0;
        XStream xstream=new XStream(new DomDriver());
        XStream.setupDefaultSecurity(xstream);
        xstream.allowTypeHierarchy(EmpleadoFijo.class);
        xstream.allowTypeHierarchy(EmpleadoEventual.class);
        try(BufferedWriter fichero=Files.newBufferedWriter(path)){
        xstream.toXML(listado,fichero);
                n=listado.size();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return n; 
    }
    
}
