class Q4
{
    public static void main(String[] args)
    {
        int num = 22787;

        for(int i = 1; i <= num; i+=2)
        {
            if (i == 1)
            {
                continue;
            }
            if (num % i == 0)
            {
                System.out.println(num + " is not a prime number.");
                break;
            }
            if (i >= Math.sqrt(num))
            {
                System.out.println(num + " is a prime number");
                break;
            }
        }
    }
}