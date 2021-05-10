package demo;

public class GeneralManager extends Leader {
    public GeneralManager(String name)
    {
        super(name);
    }

    public void handleRequest(LeaveRequest request)
    {
        if(request.getLeaveDays()<30)
        {
            System.out.println("院长" + name +"审批" + request.getLeaveName() +
                    "的请假条，请假天数为" + request.getLeaveDays() + "天。");
        }
        else
        {
            System.out.println("莫非" + request.getLeaveName() + "想被开除，居然请假" +
                    request.getLeaveDays() + "天。");
        }
    }
}
