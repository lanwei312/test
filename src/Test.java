import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args){
        Org org = new Org();
        org.setOrgId(1);
        org.setParentId(0);
        org.setOrgName("张三");
        Map<Object, Org> map = new HashMap<>();
        map.put(org.getOrgId(), org);
        List<Org> orgList = new ArrayList<>();
        orgList.add(org);
        System.out.println(orgList.get(0).getOrgId()+"-"+orgList.get(0).getParentId()+"-"+orgList.get(0).getOrgName());

        org.setOrgName("李四");
        map.put(org.getOrgId(), org);
        System.out.println(orgList.get(0).getOrgId()+"-"+orgList.get(0).getParentId()+"-"+orgList.get(0).getOrgName());

    }


}
