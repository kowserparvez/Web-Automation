package table;

import base.CommonAPI;

public class TableDataReader extends CommonAPI{

    public void readData(){
        String value = getTextByCss(".w3-responsive .w3-table-all.notranslate tr:nth-child(3)");
        System.out.println(value);
    }
}
