import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeUtil {

    //获取顶层节点
    public static List<Org> getTreeList(Integer topId, List<Org> entityList){
        //存储顶层的数据
        List<Org> resultList = new ArrayList<Org>();

        Map<Object, Org> treeMap = new HashMap<Object, Org>();
        Org itemTree;

        for (Org org : entityList) {
            //把所有的数据放到map当中，id为key
            treeMap.put(org.getOrgId(), org);
            //把顶层数据放到集合中
            if(topId == org.getParentId() || org.getParentId() == null) {
                resultList.add(org);
            }
        }

        //循环数据，把数据放到上一级的childen属性中
        for (Org org : entityList) {
            //在map集合中寻找父亲
            Org data = treeMap.get(org.getParentId());
            //判断父亲有没有
            if(data != null) {
                if(data.getOrgList() == null) {
                    data.setOrgList(new ArrayList<>());
                }
                //把子节点 放到父节点childList当中
                data.getOrgList().add(org);
                //把放好的数据放回map当中
                treeMap.put(org.getParentId(), data);
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        Org org1 = new Org();
        Org org2 = new Org();
        Org org3 = new Org();
        Org org4 = new Org();
        Org org5 = new Org();
        Org org6 = new Org();
        Org org7 = new Org();
        Org org8 = new Org();
        Org org9 = new Org();
        Org org10 = new Org();
        Org org11 = new Org();
        Org org12 = new Org();
        Org org13 = new Org();
        Org org14 = new Org();
        Org org15 = new Org();

        org1.setOrgId(1);
        org1.setOrgName("组织架构");
        org1.setParentId(0);

        org2.setOrgId(2);
        org2.setOrgName("员工管理");
        org2.setParentId(1);

        org3.setOrgId(3);
        org3.setOrgName("角色管理");
        org3.setParentId(1);

        org4.setOrgId(4);
        org4.setOrgName("菜单管理");
        org4.setParentId(1);

        org5.setOrgId(5);
        org5.setOrgName("内部员工");
        org5.setParentId(2);

        org6.setOrgId(6);
        org6.setOrgName("外协员工");
        org6.setParentId(2);

        org7.setOrgId(7);
        org7.setOrgName("新增n");
        org7.setParentId(5);

        org8.setOrgId(8);
        org8.setOrgName("编辑n");
        org8.setParentId(5);

        org9.setOrgId(9);
        org9.setOrgName("删除w");
        org9.setParentId(6);

        org10.setOrgId(10);
        org10.setOrgName("系统管理");
        org10.setParentId(0);

        org11.setOrgId(11);
        org11.setOrgName("个人资料");
        org11.setParentId(10);

        org12.setOrgId(12);
        org12.setOrgName("查看");
        org12.setParentId(11);

        org13.setOrgId(13);
        org13.setOrgName("个人设置");
        org13.setParentId(10);

        org14.setOrgId(14);
        org14.setOrgName("详情");
        org14.setParentId(2);

        org15.setOrgId(15);
        org15.setOrgName("预览");
        org15.setParentId(5);


        List<Org> orgs = new ArrayList<>();
        orgs.add(org1);
        orgs.add(org2);
        orgs.add(org3);
        orgs.add(org4);
        orgs.add(org5);
        orgs.add(org6);
        orgs.add(org7);
        orgs.add(org8);
        orgs.add(org9);
        orgs.add(org10);
        orgs.add(org11);
        orgs.add(org12);
        orgs.add(org13);
        orgs.add(org14);
        orgs.add(org15);
        List<Org> tree = getTreeList(0, orgs);
    }
}
