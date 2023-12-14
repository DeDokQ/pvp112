package part2.Command;

public class Client {
    public static void main(String[] args) {
        Database database = new Database();

        Dev dev = new Dev(
                new InsertCommand(database),
                new UpdateCommand(database),
                new SelectCommand(database),
                new DeleteCommand(database)
        );

        dev.insertRecord();
        dev.updateRecord();
        dev.selectRecord();
        dev.deleteRecord();
    }
}
