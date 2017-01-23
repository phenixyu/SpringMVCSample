package UserMapperTest;

import core.feature.test.TestSupport;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import web.dao.UserMapper;
import web.model.User;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by asus on 2017/1/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:mvc-dispatcher-servlet.xml"})
public class UserMapperTest extends TestSupport {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test_selectByExampleAndPage() {
        start();
        User user = userMapper.selectByPrimaryKey(1L);
        end();
    }
}