import java.io.Serializable;
import java.util.List;

public class Org implements Serializable {
    private static final long serialVersionUID = -2295634540940998734L;

    private Integer orgId;//单位id
    private Integer parentId;//上级单位
    private String orgName;//单位名称

    private List<Org> orgList;

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public List<Org> getOrgList() {
        return orgList;
    }

    public void setOrgList(List<Org> orgList) {
        this.orgList = orgList;
    }
}
