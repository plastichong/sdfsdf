package example;

public class Test8_2 {

    public static void dbWork(DataAccessObject dao){
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }

    public static void main(String[] args) {

        dbWork(new OracleDao());
        dbWork(new MysqlDao());

    }

}
