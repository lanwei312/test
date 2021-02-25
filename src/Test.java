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
        //  1-0-张三

        org.setOrgName("张三_new");
        //map.put(org.getOrgId(), org);
        System.out.println(orgList.get(0).getOrgId()+"-"+orgList.get(0).getParentId()+"-"+orgList.get(0).getOrgName());
        // 1-0-张三_new

        Org org2 = new Org();
        org2.setOrgId(2);
        org2.setParentId(0);
        org2.setOrgName("李四");
        List<Org> orgList2 = new ArrayList<>();
        orgList2.add(org2);
        System.out.println(orgList2.get(0).getOrgId()+"-"+orgList2.get(0).getParentId()+"-"+orgList2.get(0).getOrgName());
        // 2-0-李四

        org2.setOrgName("李四_new");
        System.out.println(orgList2.get(0).getOrgId()+"-"+orgList2.get(0).getParentId()+"-"+orgList2.get(0).getOrgName());
        // 2-0-李四_new
    }


}
