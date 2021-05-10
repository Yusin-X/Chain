package demo;

public class Client
{
    public static void main(String[] args)
    {
        Leader objDirector,objManager,objGeneralManager;

        objDirector = new Director("张三");
        objManager = new Manager("李四");
        objGeneralManager = new GeneralManager("王五");

        objDirector.setSuccessor(objManager);
        objManager.setSuccessor(objGeneralManager);

        LeaveRequest lr1 = new LeaveRequest("文文",2);
        objDirector.handleRequest(lr1);

        LeaveRequest lr2 = new LeaveRequest("阿媛",5);
        objDirector.handleRequest(lr2);

        LeaveRequest lr3 = new LeaveRequest("小谢",15);
        objDirector.handleRequest(lr3);

        LeaveRequest lr4 = new LeaveRequest("熊哥",45);
        objDirector.handleRequest(lr4);
    }
}
