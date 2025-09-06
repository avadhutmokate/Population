class Population
{
    public static void main(String[] args)
    {
        long currpop = (31232486);
        double secondyear = (365*24*60*60)*5;
        double birth = (secondyear)/7;
        double death = (secondyear)/13;
        double immigrant = (secondyear)/45;

        double newpop = currpop + birth - death + immigrant;
        System.out.println("new population is " +newpop);
        
    }
}