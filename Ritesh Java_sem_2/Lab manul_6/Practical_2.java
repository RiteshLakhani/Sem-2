import java.util.Scanner;

public class Practical_2
{
	public static void main(String[]args)
	{
		candidate c1 = new candidate();
		c1.getCandidateDetails();
		c1.displayCandidateDetails();
	}
}

class candidate
{
	Scanner sc = new Scanner(System.in);

	short candidateId;
    String candidateName;
    byte candidateAge;
    byte candidateWeight;
    byte candidateHeight;

    public void getCandidateDetails()
    {
    	System.out.print("Please Enter Candidate ID : ");
        candidateId = sc.nextShort();
        System.out.print("Please Enter Candidate Name : ");
        sc.nextLine();
        candidateName = sc.nextLine();
        System.out.print("Please Enter Candidate Age : ");
        candidateAge = sc.nextByte();
        System.out.print("Please Enter Candidate Weight : ");
        candidateWeight = sc.nextByte();
        System.out.print("Please Enter Candidate Height : ");
        candidateHeight = sc.nextByte();
    }

    public void displayCandidateDetails()
    {
    	System.out.println("Candidate ID : " + candidateId);
        System.out.println("Candidate Name : " + candidateName);
        System.out.println("Candidate age : " + candidateAge);
        System.out.println("Candidate weight : " + candidateWeight);
        System.out.println("Candidate height : " + candidateHeight);
    }
}