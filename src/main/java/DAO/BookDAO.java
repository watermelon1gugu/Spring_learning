package DAO;

import org.springframework.stereotype.Repository;

@Repository
public class BookDAO {
    private String lable = "1";

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }
}
