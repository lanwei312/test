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
        /*
        map除了基本类型是正儿八经的值传递，其余的都是引用地址传递

        由于map的value存储的引用地址传递（list），所以当list对象的内部属性发生改变时，map中的value随着改变

        所以可得：对象传的是引用地址，地址没变，内容变化，也会引起调用该对象的其他内容的变化。

        Java中的对象变量 其实就中一个指针，他指向对象的首地址，map中key对应的其实是某个对象的首地址，指向的是某个对象，
        你往对象中加了数据，对象的内容变了，但是对象的首地址没有变，map中的key仍然指向的是这个对象的首地址。
        */

        Org org3 = new Org();
        org3.setOrgId(3);
        org3.setOrgName("班主任");
        org3.setParentId(0);

        Org org4 = new Org();
        org4.setOrgId(4);
        org4.setOrgName("体育委员");
        org4.setParentId(3);

        List<Org> orgList3 = new ArrayList<>();
        orgList3.add(org3);
        orgList3.add(org4);
        Map<Object, Object> obj = new HashMap<>();
        obj.put(org3.getOrgId(), org3);
        obj.put(org4.getOrgId(), org4);
        org3.setOrgList(new ArrayList<>());
        org3.getOrgList().add(org4);
        org4.setOrgName("语文老师");
        System.out.println("66");

    }


}
