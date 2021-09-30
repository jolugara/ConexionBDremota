package testdb;

import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author JorgeLPR
 */
public class ConexionPool {
    
    private final String DB="czNJ8gixWD";
    private final String URL="jdbc:mysql://remotemysql.com:3306/"+DB+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";;
    private final String USER="czNJ8gixWD";
    private final String PASS="xTww7cML8W";
    
    public DataSource dataSource=null;
    
    public ConexionPool(){

        inicializaDataSource();

    }

    /**
     * Metodo en el cual inicializamos un objeto que nos va a permitir establecer las respectivas conexiones con la base de datos.
     */
    private void inicializaDataSource() {

        try{

            BasicDataSource basicDataSource = new BasicDataSource();

            basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
            basicDataSource.setUsername(USER);
            basicDataSource.setPassword(PASS);
            basicDataSource.setUrl(URL);
            basicDataSource.setMaxTotal(50);

            dataSource = basicDataSource;

            System.out.println("Conexion exitosa");
            
        }catch(Exception ex){
            System.out.println("error "+ex.getMessage());
        }

    }      
}
