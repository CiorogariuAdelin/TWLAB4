import java.io.StringWriter;
import java.util.ArrayList;

import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;

import javax.xml.crypto.Data;

public class Main {
    public static void main( String[] args ) throws Exception {
        // Get and initialize an engine
        VelocityEngine ve = new VelocityEngine();
        ve.init();
        // Get the Template
        Template t = ve.getTemplate( "src/HtmlFromJava.vm" );
        // Create a context and add data
        VelocityContext context = new VelocityContext();
        altele details = new altele("Angajat","Casatorit","Fumator");
        UserInfo user = new UserInfo("John", "10","1.80m","50kg",details);
        UserInfo user2 = new UserInfo("Dan", "10","1.80m","50kg",details);
        persoane p=new persoane(user);
        p.addpersoane(user2);
        context.put("persoana", p.getpersoana());
        // Render the template into a StringWriter
        StringWriter writer = new StringWriter();
        t.merge( context, writer );
        // Show the result
        System.out.println( writer.toString() );
    }
}