package filesdemo;

import java.text.NumberFormat;
import java.text.ParseException;

public class Computer
{
    private String partnumber;
    private String description;
    private double price;

    public Computer()
    {
        this("", "", 0);
    }

    public Computer(String partnumber, String description, double price)
    {
        this.partnumber = partnumber;
        this.description = description;
        this.price = price;
    }

    public void setPartnumber(String partnumber)
    {
        this.partnumber = partnumber;
    }

    public String getPartnumber(){
        return partnumber;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }

    public String getFormattedPrice()
    {
        NumberFormat number = NumberFormat.getNumberInstance();
        number.setMinimumFractionDigits(2);
        number.setMaximumFractionDigits(2);
        return number.format(price);
    }

    public void setFormattedPrice(String formattedPrice)
    {
        NumberFormat number = NumberFormat.getNumberInstance();
        Number n;
        try
        {
            n = number.parse(formattedPrice);
        }
        catch (ParseException e)
        {
            n = 0;
        }
        this.price = n.doubleValue();
    }

    public boolean equals(Object object)
    {
        if (object instanceof Computer)
        {
            Computer computer2 = (Computer) object;
            if
            (
                partnumber.equals(computer2.getPartnumber()) &&
                description.equals(computer2.getDescription()) &&
                price == computer2.getPrice()
            )
                return true;
        }
        return false;
    }

    public String toString()
    {
        return description;
    }
}