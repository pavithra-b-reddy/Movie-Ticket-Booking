//The following program creates a simple text-based ticket booking interface.
import java.io.*;
public class Ticket_Booking
{
    static char ch,foo;
    static int m_no;
    static int date,time,t_no;

//The following function displays the available movies, dates and show timings for ENGLISH Language movies.
    void English() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try
        {
            do
            {
                System.out.println("Enter your choice of movie by indicating the number: \n 1)The Martian \n 2)Pan \n 3)Everest \n 4)The Walk");
                m_no=Integer.parseInt(br.readLine());
                if(m_no<1 || m_no>4)
                    System.out.println("Input Error");
            }while(m_no<1 || m_no>4);
            String m[]={"The Martian","Pan","Everest","The Walk"};
            String t[]={"Forum Value Mall","Mantri Square","Garuda Mall","Forum Mall"};
            String d[]={"26.10.15","27.10.15","28.01.15","29.10.15","30.10.15","31.10.15"};
            String timing[]={"10:00am","1:00pm","4:00pm","7:00pm","10:00pm"};
            if(m_no==1)
            {
                do
                {
                    System.out.println("The movie is being screened at the following theaters: \n 1)Forum Value Mall \n 2)Mantri Square \n 3)Garuda Mall \n 4)Forum Mall \nChoose a theatre of you choice by indicating the number");
                    t_no=Integer.parseInt(br.readLine());
                    if(t_no<1 || t_no>4)
                        System.out.println("Input Error");
                }while(t_no<1 || t_no>4);
                do
                {
                    System.out.println("Select the date: \n 1)26.10.15 \n 2)27.10.15 \n 3)28.10.15 \n 4)29.10.15 \n 5)30.10.15 \nChoose a date of your choice by indicating the number");
                    date=Integer.parseInt(br.readLine());
                    if(date<1 || date>5)
                        System.out.println("Input Error");
                }while(date<1 || date>5);
                do
                {
                    System.out.println("Select the timing: \n 1)10:00am \n 2)1:00pm \n 3)4:00pm \n 4)7:00pm \n 5)10:00pm \nChoose a show of your choice by indicating the number");
                    time=Integer.parseInt(br.readLine());
                    if(time<1 || time>5)
                        System.out.println("Input Error");
                }while(time<1 || time>5);
            }
            else if(m_no==2)
            {
                do
                {
                    System.out.println("The movie is being screened at the following theaters: \n 1)Forum Value Mall \n 2)Mantri Square \n 3)Garuda Mall \nChoose a theatre of you choice by indicating the number");
                    t_no=Integer.parseInt(br.readLine());
                    if(t_no<1 || t_no>3)
                        System.out.println("Input Error");
                }while(t_no<1 || t_no>3);
                do
                {
                    System.out.println("Select the date: \n 1)26.10.15 \n 2)27.10.15 \n 3)28.10.15 \n 4)29.10.15\nChoose a date of your choice by indicating the number");
                    date=Integer.parseInt(br.readLine());
                    if(date<1 || date>4)
                        System.out.println("Input Error");
                }while(date<1 || date>4);
                do
                {
                    System.out.println("Select the timing: \n 1)10:00am \n 2)1:00pm \n 3)4:00pm \n 4)7:00pm\nChoose a show of your choice by indicating the number");
                    time=Integer.parseInt(br.readLine());
                    if(time<1 || time>4)
                        System.out.println("Input Error");
                }while(time<1 || time>4);
            }
            else if(m_no==3)
            {
                do
                {
                    System.out.println("The movie is being screened at the following theaters: \n 1)Forum Value Mall \n 2)Mantri Square\nChoose a theatre of you choice by indicating the number");
                    t_no=Integer.parseInt(br.readLine());
                    if(t_no<1 || t_no>2)
                        System.out.println("Input Error");
                }while(t_no<1 || t_no>2);
                do
                {
                    System.out.println("Select the date: \n 1)26.10.15 \n 2)27.10.15 \n 3)28.10.15\nChoose a date of your choice by indicating the number");
                    date=Integer.parseInt(br.readLine());
                    if(date<1 || date>3)
                        System.out.println("Input Error");
                }while(date<1 || date>3);
                do
                {
                    System.out.println("Select the timing: \n 1)10:00am \n 2)1:00pm \n 3)4:00pm\nChoose a show of your choice by indicating the number");
                    time=Integer.parseInt(br.readLine());
                    if(time<1 || time>3)
                        System.out.println("Input Error");
                }while(time<1 || time>3);
            }
            else if(m_no==4)
            {
                do
                {
                    System.out.println("The movie is being screened at the following theaters: \n 1)Forum Value Mall \n 2)Mantri Square \n 3)Garuda Mall \n 4)Forum Mall \nChoose a theatre of you choice by indicating the number");
                    t_no=Integer.parseInt(br.readLine());
                    if(t_no<1 || t_no>4)
                        System.out.println("Input Error");
                }while(t_no<1 || t_no>4);
                do
                {
                    System.out.println("Select the date: \n 1)26.10.15 \n 2)27.10.15 \n 3)28.10.15 \n 4)29.10.15 \n 5)30.10.15 \nChoose a date of your choice by indicating the number");
                    date=Integer.parseInt(br.readLine());
                    if(date<1 || date>5)
                        System.out.println("Input Error");
                }while(date<1 || date>5);
                do
                {
                    System.out.println("Select the timing: \n 1)10:00am \n 2)1:00pm \n 3)4:00pm \n 4)7:00pm \n 5)10:00pm \nChoose a show of your choice by indicating the number");
                    time=Integer.parseInt(br.readLine());
                    if(time<1 || time>5)
                        System.out.println("Input Error");
                }while(time<1 || time>5);
            }
            System.out.println("The movie selected is "+m[m_no-1]+"  and the theatre is "+t[t_no-1]+" and the date is "+d[date-1]+" and the show timimgs are "+timing[time-1]);
        }
        catch(Exception ex)
        {
            System.out.println("Error in entering data\n Please try again");
            System.exit(0);
        }
    }

//The following function displays the available movies, dates and show timings for KANNADA Language movies.
    void Kannada() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try
        {
            do
            {
                System.out.println("Enter your choice of movie by indicating the number: \n 1)Kavalu Daari \n 2)Bell Bottom \n 3)U Turn");
                m_no=Integer.parseInt(br.readLine());
                if(m_no<1 || m_no>3)
                    System.out.println("Input Error");
            }while(m_no<1 || m_no>3);
            String m[]={"A","B","C","D"};
            String t[]={"Forum Value Mall","Mantri Square","Garuda Mall","Forum Mall"};
            String d[]={"26.10.15","27.10.15","28.01.15","29.10.15","30.10.15","31.10.15"};
            String timing[]={"10:00am","1:00pm","4:00pm","7:00pm","10:00pm"};
            if(m_no==1)
            {
                do
                {
                    System.out.println("The movie is being screened at the following theaters: \n 1)Forum Value Mall \n 2)Mantri Square \n 3)Garuda Mall \n 4)Forum Mall \nChoose a theatre of you choice by indicating the number");
                    t_no=Integer.parseInt(br.readLine());
                    if(t_no<1 || t_no>4)
                        System.out.println("Input Error");
                }while(t_no<1 || t_no>4);
                do
                {
                    System.out.println("Select the date: \n 1)26.10.15 \n 2)27.10.15 \n 3)28.10.15 \n 4)29.10.15 \n 5)30.10.15 \nChoose a date of your choice by indicating the number");
                    date=Integer.parseInt(br.readLine());
                    if(date<1 || date>5)
                        System.out.println("Input Error");
                }while(date<1 || date>5);
                do
                {
                    System.out.println("Select the timing: \n 1)10:00am \n 2)1:00pm \n 3)4:00pm \n 4)7:00pm \n 5)10:00pm \nChoose a show of your choice by indicating the number");
                    time=Integer.parseInt(br.readLine());
                    if(time<1 || time>5)
                        System.out.println("Input Error");
                }while(time<1 || time>5);
            }
            else if(m_no==2)
            {
                do
                {
                    System.out.println("The movie is being screened at the following theaters: \n 1)Forum Value Mall \n 2)Mantri Square \n 3)Garuda Mall \nChoose a theatre of you choice by indicating the number");
                    t_no=Integer.parseInt(br.readLine());
                    if(t_no<1 || t_no>3)
                        System.out.println("Input Error");
                }while(t_no<1 || t_no>3);
                do
                {
                    System.out.println("Select the date: \n 1)26.10.15 \n 2)27.10.15 \n 3)28.10.15 \n 4)29.10.15\nChoose a date of your choice by indicating the number");
                    date=Integer.parseInt(br.readLine());
                    if(date<1 || date>4)
                        System.out.println("Input Error");
                }while(date<1 || date>4);
                do
                {
                    System.out.println("Select the timing: \n 1)10:00am \n 2)1:00pm \n 3)4:00pm \n 4)7:00pm\nChoose a show of your choice by indicating the number");
                    time=Integer.parseInt(br.readLine());
                    if(time<1 || time>4)
                        System.out.println("Input Error");
                }while(time<1 || time>4);
            }
            else if(m_no==3)
            {
                do
                {
                    System.out.println("The movie is being screened at the following theaters: \n 1)Forum Value Mall \n 2)Mantri Square\nChoose a theatre of you choice by indicating the number");
                    t_no=Integer.parseInt(br.readLine());
                    if(t_no<1 || t_no>2)
                        System.out.println("Input Error");
                }while(t_no<1 || t_no>2);
                do
                {
                    System.out.println("Select the date: \n 1)26.10.15 \n 2)27.10.15 \n 3)28.10.15\nChoose a date of your choice by indicating the number");
                    date=Integer.parseInt(br.readLine());
                    if(date<1 || date>3)
                        System.out.println("Input Error");
                }while(date<1 || date>3);
                do
                {
                    System.out.println("Select the timing: \n 1)10:00am \n 2)1:00pm \n 3)4:00pm\nChoose a show of your choice by indicating the number");
                    time=Integer.parseInt(br.readLine());
                    if(time<1 || time>3)
                        System.out.println("Input Error");
                }while(time<1 || time>3);
            }
            System.out.println("The movie selected is "+m[m_no-1]+"  and the theatre is "+t[t_no-1]+" and the date is "+d[date-1]+" and the show timimgs are "+timing[time-1]);
        }
        catch(Exception ex)
        {
            System.out.println("Error in entering data\n Please try again");
            System.exit(0);
        }
    }

//The following function displays the available movies, dates and show timings for TELUGU Language movies.
    void Telugu() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try
        {
            do
            {
                System.out.println("Enter your choice of movie by indicating the number: \n 1)Goodachari \n 2)Brochevarevarura \n 3)Agent SS Athreya ");
                m_no=Integer.parseInt(br.readLine());
                if(m_no<1 || m_no>3)
                    System.out.println("Input Error");
            }while(m_no<1 || m_no>3);
            String m[]={"A","B","C","D"};
            String t[]={"Forum Value Mall","Mantri Square","Garuda Mall","Forum Mall"};
            String d[]={"26.10.15","27.10.15","28.01.15","29.10.15","30.10.15","31.10.15"};
            String timing[]={"10:00am","1:00pm","4:00pm","7:00pm","10:00pm"};
            if(m_no==1)
            {
                do
                {
                    System.out.println("The movie is being screened at the following theaters: \n 1)Forum Value Mall \n 2)Mantri Square \n 3)Garuda Mall \n 4)Forum Mall \nChoose a theatre of you choice by indicating the number");
                    t_no=Integer.parseInt(br.readLine());
                    if(t_no<1 || t_no>4)
                        System.out.println("Input Error");
                }while(t_no<1 || t_no>4);
                do
                {
                    System.out.println("Select the date: \n 1)26.10.15 \n 2)27.10.15 \n 3)28.10.15 \n 4)29.10.15 \n 5)30.10.15 \nChoose a date of your choice by indicating the number");
                    date=Integer.parseInt(br.readLine());
                    if(date<1 || date>5)
                        System.out.println("Input Error");
                }while(date<1 || date>5);
                do
                {
                    System.out.println("Select the timing: \n 1)10:00am \n 2)1:00pm \n 3)4:00pm \n 4)7:00pm \n 5)10:00pm \nChoose a show of your choice by indicating the number");
                    time=Integer.parseInt(br.readLine());
                    if(time<1 || time>5)
                        System.out.println("Input Error");
                }while(time<1 || time>5);
            }
            else if(m_no==2)
            {
                do
                {
                    System.out.println("The movie is being screened at the following theaters: \n 1)Forum Value Mall \n 2)Mantri Square \n 3)Garuda Mall \nChoose a theatre of you choice by indicating the number");
                    t_no=Integer.parseInt(br.readLine());
                    if(t_no<1 || t_no>3)
                        System.out.println("Input Error");
                }while(t_no<1 || t_no>3);
                do
                {
                    System.out.println("Select the date: \n 1)26.10.15 \n 2)27.10.15 \n 3)28.10.15 \n 4)29.10.15\nChoose a date of your choice by indicating the number");
                    date=Integer.parseInt(br.readLine());
                    if(date<1 || date>4)
                        System.out.println("Input Error");
                }while(date<1 || date>4);
                do
                {
                    System.out.println("Select the timing: \n 1)10:00am \n 2)1:00pm \n 3)4:00pm \n 4)7:00pm\nChoose a show of your choice by indicating the number");
                    time=Integer.parseInt(br.readLine());
                    if(time<1 || time>4)
                        System.out.println("Input Error");
                }while(time<1 || time>4);
            }
            else if(m_no==3)
            {
                do
                {
                    System.out.println("The movie is being screened at the following theaters: \n 1)Forum Value Mall \n 2)Mantri Square\nChoose a theatre of you choice by indicating the number");
                    t_no=Integer.parseInt(br.readLine());
                    if(t_no<1 || t_no>2)
                        System.out.println("Input Error");
                }while(t_no<1 || t_no>2);
                do
                {
                    System.out.println("Select the date: \n 1)26.10.15 \n 2)27.10.15 \n 3)28.10.15\nChoose a date of your choice by indicating the number");
                    date=Integer.parseInt(br.readLine());
                    if(date<1 || date>3)
                        System.out.println("Input Error");
                }while(date<1 || date>3);
                do
                {
                    System.out.println("Select the timing: \n 1)10:00am \n 2)1:00pm \n 3)4:00pm\nChoose a show of your choice by indicating the number");
                    time=Integer.parseInt(br.readLine());
                    if(time<1 || time>3)
                        System.out.println("Input Error");
                }while(time<1 || time>3);
            }
            System.out.println("The movie selected is "+m[m_no-1]+" and the theatre is "+t[t_no-1]+" and the date is "+d[date-1]+" and the show timimgs are "+timing[time-1]);
        }
        catch(Exception ex)
        {
            System.out.println("Error in entering data\n Please try again");
            System.exit(0);
        }
    }

//The following function displays the available movies, dates and show timings for MALAYALAM Language movies.
    void Malayalam() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try
        {
            do
            {
                System.out.println("Enter your choice of movie by indicating the number: \n 1)Premam \n 2)Bangalore Days \n 3)Drishyam");
                m_no=Integer.parseInt(br.readLine());
                if(m_no<1 || m_no>3)
                    System.out.println("Input Error");
            }while(m_no<1 || m_no>3);
            String m[]={"A","B","C","D"};
            String t[]={"Forum Value Mall","Mantri Square","Garuda Mall","Forum Mall"};
            String d[]={"26.10.15","27.10.15","28.01.15","29.10.15","30.10.15","31.10.15"};
            String timing[]={"10:00am","1:00pm","4:00pm","7:00pm","10:00pm"};
            if(m_no==1)
            {
                do
                {
                    System.out.println("The movie is being screened at the following theaters: \n 1)Forum Value Mall \n 2)Mantri Square \n 3)Garuda Mall \n 4)Forum Mall \nChoose a theatre of you choice by indicating the number");
                    t_no=Integer.parseInt(br.readLine());
                    if(t_no<1 || t_no>4)
                        System.out.println("Input Error");
                }while(t_no<1 || t_no>4);
                do
                {
                    System.out.println("Select the date: \n 1)26.10.15 \n 2)27.10.15 \n 3)28.10.15 \n 4)29.10.15 \n 5)30.10.15 \nChoose a date of your choice by indicating the number");
                    date=Integer.parseInt(br.readLine());
                    if(date<1 || date>5)
                        System.out.println("Input Error");
                }while(date<1 || date>5);
                do
                {
                    System.out.println("Select the timing: \n 1)10:00am \n 2)1:00pm \n 3)4:00pm \n 4)7:00pm \n 5)10:00pm \nChoose a show of your choice by indicating the number");
                    time=Integer.parseInt(br.readLine());
                    if(time<1 || time>5)
                        System.out.println("Input Error");
                }while(time<1 || time>5);
            }
            else if(m_no==2)
            {
                do
                {
                    System.out.println("The movie is being screened at the following theaters: \n 1)Forum Value Mall \n 2)Mantri Square \n 3)Garuda Mall \nChoose a theatre of you choice by indicating the number");
                    t_no=Integer.parseInt(br.readLine());
                    if(t_no<1 || t_no>3)
                        System.out.println("Input Error");
                }while(t_no<1 || t_no>3);
                do
                {
                    System.out.println("Select the date: \n 1)26.10.15 \n 2)27.10.15 \n 3)28.10.15 \n 4)29.10.15\nChoose a date of your choice by indicating the number");
                    date=Integer.parseInt(br.readLine());
                    if(date<1 || date>4)
                        System.out.println("Input Error");
                }while(date<1 || date>4);
                do
                {
                    System.out.println("Select the timing: \n 1)10:00am \n 2)1:00pm \n 3)4:00pm \n 4)7:00pm\nChoose a show of your choice by indicating the number");
                    time=Integer.parseInt(br.readLine());
                    if(time<1 || time>4)
                        System.out.println("Input Error");
                }while(time<1 || time>4);
            }
            else if(m_no==3)
            {
                do
                {
                    System.out.println("The movie is being screened at the following theaters: \n 1)Forum Value Mall \n 2)Mantri Square\nChoose a theatre of you choice by indicating the number");
                    t_no=Integer.parseInt(br.readLine());
                    if(t_no<1 || t_no>2)
                        System.out.println("Input Error");
                }while(t_no<1 || t_no>2);
                do
                {
                    System.out.println("Select the date: \n 1)26.10.15 \n 2)27.10.15 \n 3)28.10.15\nChoose a date of your choice by indicating the number");
                    date=Integer.parseInt(br.readLine());
                    if(date<1 || date>3)
                        System.out.println("Input Error");
                }while(date<1 || date>3);
                do
                {
                    System.out.println("Select the timing: \n 1)10:00am \n 2)1:00pm \n 3)4:00pm\nChoose a show of your choice by indicating the number");
                    time=Integer.parseInt(br.readLine());
                    if(time<1 || time>3)
                        System.out.println("Input Error");
                }while(time<1 || time>3);
            }
            System.out.println("The movie selected is "+m[m_no-1]+"  and the theatre is "+t[t_no-1]+" and the date is "+d[date-1]+" and the show timimgs are "+timing[time-1]);
        }
        catch(Exception ex)
        {
            System.out.println("Error in entering data\n Please try again");
            System.exit(0);
        }
    }

//The following function displays the available movies, dates and show timings for HINDI Language movies.
    void Hindi() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try
        {
            do
            {
                System.out.println("Enter your choice of movie by indicating the number: \n 1)Andhadhun \n 2)Baby \n 3)Ittefaq");
                m_no=Integer.parseInt(br.readLine());
                if(m_no<1 || m_no>3)
                    System.out.println("Input Error");
            }while(m_no<1 || m_no>3);
            String m[]={"A","B","C","D"};
            String t[]={"Forum Value Mall","Mantri Square","Garuda Mall","Forum Mall"};
            String d[]={"26.10.15","27.10.15","28.01.15","29.10.15","30.10.15","31.10.15"};
            String timing[]={"10:00am","1:00pm","4:00pm","7:00pm","10:00pm"};
            if(m_no==1)
            {
                do
                {
                    System.out.println("The movie is being screened at the following theaters: \n 1)Forum Value Mall \n 2)Mantri Square \n 3)Garuda Mall \n 4)Forum Mall \nChoose a theatre of you choice by indicating the number");
                    t_no=Integer.parseInt(br.readLine());
                    if(t_no<1 || t_no>4)
                        System.out.println("Input Error");
                }while(t_no<1 || t_no>4);
                do
                {
                    System.out.println("Select the date: \n 1)26.10.15 \n 2)27.10.15 \n 3)28.10.15 \n 4)29.10.15 \n 5)30.10.15 \nChoose a date of your choice by indicating the number");
                    date=Integer.parseInt(br.readLine());
                    if(date<1 || date>5)
                        System.out.println("Input Error");
                }while(date<1 || date>5);
                do
                {
                    System.out.println("Select the timing: \n 1)10:00am \n 2)1:00pm \n 3)4:00pm \n 4)7:00pm \n 5)10:00pm \nChoose a show of your choice by indicating the number");
                    time=Integer.parseInt(br.readLine());
                    if(time<1 || time>5)
                        System.out.println("Input Error");
                }while(time<1 || time>5);
            }
            else if(m_no==2)
            {
                do
                {
                    System.out.println("The movie is being screened at the following theaters: \n 1)Forum Value Mall \n 2)Mantri Square \n 3)Garuda Mall \nChoose a theatre of you choice by indicating the number");
                    t_no=Integer.parseInt(br.readLine());
                    if(t_no<1 || t_no>3)
                        System.out.println("Input Error");
                }while(t_no<1 || t_no>3);
                do
                {
                    System.out.println("Select the date: \n 1)26.10.15 \n 2)27.10.15 \n 3)28.10.15 \n 4)29.10.15\nChoose a date of your choice by indicating the number");
                    date=Integer.parseInt(br.readLine());
                    if(date<1 || date>4)
                        System.out.println("Input Error");
                }while(date<1 || date>4);
                do
                {
                    System.out.println("Select the timing: \n 1)10:00am \n 2)1:00pm \n 3)4:00pm \n 4)7:00pm\nChoose a show of your choice by indicating the number");
                    time=Integer.parseInt(br.readLine());
                    if(time<1 || time>4)
                        System.out.println("Input Error");
                }while(time<1 || time>4);
            }
            else if(m_no==3)
            {
                do
                {
                    System.out.println("The movie is being screened at the following theaters: \n 1)Forum Value Mall \n 2)Mantri Square\nChoose a theatre of you choice by indicating the number");
                    t_no=Integer.parseInt(br.readLine());
                    if(t_no<1 || t_no>2)
                        System.out.println("Input Error");
                }while(t_no<1 || t_no>2);
                do
                {
                    System.out.println("Select the date: \n 1)26.10.15 \n 2)27.10.15 \n 3)28.10.15\nChoose a date of your choice by indicating the number");
                    date=Integer.parseInt(br.readLine());
                    if(date<1 || date>3)
                        System.out.println("Input Error");
                }while(date<1 || date>3);
                do
                {
                    System.out.println("Select the timing: \n 1)10:00am \n 2)1:00pm \n 3)4:00pm\nChoose a show of your choice by indicating the number");
                    time=Integer.parseInt(br.readLine());
                    if(time<1 || time>3)
                        System.out.println("Input Error");
                }while(time<1 || time>3);
            }
            System.out.println("The movie selected is "+m[m_no-1]+"  and the theatre is "+t[t_no-1]+" and the date is "+d[date-1]+" and the show timimgs are "+timing[time-1]);
        }
        catch(Exception ex)
        {
            System.out.println("Error in entering data\n Please try again");
            System.exit(0);
        }
    }

//This function accepts input from the user and calls the appropriate functions based on choices made by the user from a set of options.
//It allows the user to select the language of the movie, show timings, seats and pay for the tickets
    public static void main() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Ticket_Booking ticket=new Ticket_Booking();
        do
        {
            System.out.println("Enter the language(K for Kannada/T for Telugu/E for English/M for Malayalam/H for Hindi)");
            ch=(char)br.read();
            foo=(char)br.read();
            if(ch=='E' || ch=='e')
                ticket.English();
            else if(ch=='K' || ch=='k')
                ticket.Kannada();
            else if(ch=='T'  || ch=='t')
                ticket.Telugu();
            else if(ch=='M' || ch=='m')
                ticket.Malayalam();
            else if(ch=='H' || ch=='h')
                ticket.Hindi();
            else
                System.out.println("Input Error");
        }while(ch!='E' && ch!='K' && ch!='T' && ch!='M' && ch!='H' && ch!='e' && ch!='k' && ch!='t' && ch!='m' && ch!='h');
        char confirm, x, dummy;
        do
        {
            System.out.println("Are you sure you want to proceed to the selection of seats(Y for Yes/N for No)?");
            confirm=(char)br.read();
            dummy=(char)br.read();
            if(confirm!='Y' && confirm!='y' && confirm!='N' && confirm!='n')
                System.out.println("Input Error");
        }while(confirm!='Y' && confirm!='y' && confirm!='N' && confirm!='n');
        int n=0;
        if(confirm=='Y' || confirm=='y')
        {
            try
            {
                System.out.println("Enter the number of seats");
                n=Integer.parseInt(br.readLine());
            }
            catch(Exception ex)
            {
                System.out.println("Error in entering data\n Please try again");
                System.exit(0);
            }
            char row[]=new char[n];
            int seat[]=new int[n];
            for(int i=0;i<n;i++)
            {
                do
                {
                    System.out.println("Enter the row(A/B/C/D/E/F) for ticket no "+(i+1));
                    row[i]=(char)br.read();
                    dummy=(char)br.read();
                    if(Character.toUpperCase(row[i])!='A' && Character.toUpperCase(row[i])!='B' && Character.toUpperCase(row[i])!='C' && Character.toUpperCase(row[i])!='D' && Character.toUpperCase(row[i])!='E' && Character.toUpperCase(row[i])!='F')
                        System.out.println("Input Error");
                }while(Character.toUpperCase(row[i])!='A' && Character.toUpperCase(row[i])!='B' && Character.toUpperCase(row[i])!='C' && Character.toUpperCase(row[i])!='D' && Character.toUpperCase(row[i])!='E' && Character.toUpperCase(row[i])!='F');
                do
                {
                    System.out.println("Enter the seat no(1-24) for ticket no "+(i+1));
                    try
                    {
                        seat[i]=Integer.parseInt(br.readLine());
                    }
                    catch(Exception ex)
                    {
                        System.out.println("Error in entering data\n Please try again");
                        System.exit(0);
                    }
                    if(seat[i]<1 || seat[i]>24)
                        System.out.println("Input Error");
                }while(seat[i]<1 || seat[i]>24);
                for(int j=0;j<i;j++)
                {
                    if(row[i]==row[j] && seat[i]==seat[j])
                    {
                        System.out.println("Input Error");
                        i--;
                    }
                }
            }
            int pay;
            do
            {
                System.out.println("Enter your mode of payment: \n 1)Credit Card \n 2)Net Banking");
                pay=Integer.parseInt(br.readLine());
                if(pay!=1 && pay!=2)
                    System.out.println("Input Error");
            }while(pay!=1 && pay!=2);
            if(pay==1)
            {
                System.out.println("Enter your credit card no");
                int card_no=Integer.parseInt(br.readLine());
                System.out.println("Enter your PIN");
                int pin=Integer.parseInt(br.readLine());
            }
            else if(pay==2)
            {
                System.out.println("Enter the name of your bank");
                String bank=br.readLine();
                System.out.println("Enter your username");
                String user_name=br.readLine();
                System.out.println("Enter your password");
                String password=br.readLine();
            }
            double cost=300.00;
            System.out.println(" Cost for each ticket:"+cost+"\n Cost for "+n+" tickets is "+(cost*n)+"\n Tax="+(0.12*(cost*n))+"\n Total amount="+((cost*n)+(0.12*(cost*n))));
            try
            {
                System.out.println("Enter your mobile no. to which the booking confirmation will be sent");
                long mob_no=Long.parseLong(br.readLine());
            }
            catch(Exception ex)
            {
                System.out.println("Error in entering data\n Please try again");
                System.exit(0);
            }
            System.out.println("You will be recieving your booking confirmation shortly...\nThank you for choosing ABCD Cinemas");
        }
        else if(confirm=='n' || confirm=='N')
            System.out.println("Oops!!The booking was cancelled");
    }
}
