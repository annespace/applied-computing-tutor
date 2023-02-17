public class TestFriendlyDate
{
    public static void main(String[] args) throws Exception{
        FriendlyDate e1 = new FriendlyDate();
        e1.setYear(2023);
        e1.setMonth(2);
        e1.setDay(22);
        System.out.println(e1.getFriendlyDate());
    }
}