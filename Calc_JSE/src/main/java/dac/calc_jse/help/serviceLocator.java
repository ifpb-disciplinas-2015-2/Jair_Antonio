/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dac.calc_jse.help;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Antonio Junior
 */
public class serviceLocator {

    public <T> T lookup(String recurso, Class<T> tipo) {
        try {
            Properties props = new Properties();
            props.put(Context.INITIAL_CONTEXT_FACTORY,
                    "com.sun.enterprise.naming.SerialInitContextFactory");
            props.setProperty("org.omg.CORBA.ORBInitalHost", "Loclhost");
            props.setProperty("org.omg.CORBA.ORBInitalPort", "3700");
            InitialContext context = new InitialContext(props);
            return (T) context.lookup(recurso);
        } catch (NamingException ex) {
            Logger.getLogger(serviceLocator.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return null;
    }
}
