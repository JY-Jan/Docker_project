package itree.test;

import com.github.tools.generators.codes.ServiceGenerator;
import com.github.tools.generators.codes.WebfrkGenerator;
import com.github.tools.generators.docs.APIDocGenerator;
import com.github.tools.generators.docs.SqlDocGenerator;

import test.test.mappers.UserMapper;
import test.test.services.UserService;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ) throws Exception
    {
        WebfrkGenerator generator = new WebfrkGenerator();
        generator.generate();
        
        
        ServiceGenerator sg = new ServiceGenerator();
        sg.createServiceFromMapper(UserMapper.class);
        sg.write();
        
        APIDocGenerator apig = new APIDocGenerator();
        //对应application.yml
       apig.createAPIDoc("http://127.0.0.1:12345", UserService.class);
       apig.write();
       
       SqlDocGenerator wg = new SqlDocGenerator();
       wg.createSqlDoc("dev.examples.mysql.models.User");
       wg.print();
       wg.write();
       
    }
}
