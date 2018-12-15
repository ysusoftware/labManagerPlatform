import org.software.ysu.pojo.Category;
import org.software.ysu.service.achievements.CategoryServiceImpI;

import javax.annotation.Resource;
import java.util.List;

public class categoryTest {
    public static void main(String[] args) {
        CategoryServiceImpI categoryServiceImpI=new CategoryServiceImpI();
        List<Category> list=categoryServiceImpI.selectCategory("大数据");
        System.out.println(list.get(0).getCategoryName());
    }
}
