/************************************************************************************
 * Do not modify this file Project1Exception class. 
 * It is used by Fraction and MixedNumber classes
 *************************************************************************************/

 

public class Project1Exception extends RuntimeException
{
    public Project1Exception()
    {
	this("");
    }

    public Project1Exception(String errorMsg) 
    {
	super(errorMsg);
    }

}
