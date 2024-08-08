import java.util.*;

interface HospitalManagement
{
	void display();
}

abstract class AbstractHospitalManagement implements HospitalManagement
{
	abstract void manageInventory();
}
class Hospital_management
{
	String HospitalName;
	int NumberOfCustomers;
	int NumberOfTreatments;
	double ConsultationFee;
	public Hospital_management(String hospitalName, int numberOfCustomers, int numberOfTreatments,
			double consultationFee) {
		super();
		HospitalName = hospitalName;
		NumberOfCustomers = numberOfCustomers;
		NumberOfTreatments = numberOfTreatments;
		ConsultationFee = consultationFee;
	}
	public String getHospitalName() {
		return HospitalName;
	}
	public void setHospitalName(String hospitalName) {
		HospitalName = hospitalName;
	}
	public int getNumberOfCustomers() {
		return NumberOfCustomers;
	}
	public void setNumberOfCustomers(int numberOfCustomers) {
		NumberOfCustomers = numberOfCustomers;
	}
	public int getNumberOfTreatments() {
		return NumberOfTreatments;
	}
	public void setNumberOfTreatments(int numberOfTreatments) {
		NumberOfTreatments = numberOfTreatments;
	}
	public double getConsultationFee() {
		return ConsultationFee;
	}
	public void setConsultationFee(double consultationFee) {
		ConsultationFee = consultationFee;
	}
}
public class Hospital extends AbstractHospitalManagement {
	static HospitalManagement a=new Hospital();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		a.display();
		System.out.println("Enter the Number of Hospital Objects you need: ");
		int n=sc.nextInt();
//		sc.nextLine();
		Hospital_management[] hm=new Hospital_management[n];
		for(int i=0;i<n;i++)
		{
			sc.nextLine();
			System.out.println("Enter the Hospital Name: ");
			String HospitalName=sc.nextLine();
			System.out.println("Enter the Number of Patients: ");
			int NumberOfCustomers=sc.nextInt();
			System.out.println("Enter the Available Number of Treatmens: ");
			int NumberOfTreatments=sc.nextInt();
			System.out.println("Enter the Doctor's Consultation Fee: ");
			double ConsultationFee=sc.nextDouble();
			sc.nextLine();
			hm[i]=new Hospital_management(HospitalName,NumberOfCustomers,NumberOfTreatments,ConsultationFee);
		}
		sc.nextLine();
		System.out.println("Enter the Required Hospital Name to check the Consultation Fee:");
		String search=sc.nextLine();
		double result=searchByHospitalName(hm,search);
		if(result!=0.0)
		{
			System.out.println("Doctor's Consultation Fee for given Hospital is: "+result+"\n");
		}
		else
		{
			System.out.println("Hospital Not Found.");
		}
		
		List<Hospital_management> result2=sortbyConsultationFee(hm);
		if(result2!=null)
		{
			for(Hospital_management h:result2)
			{
				System.out.println("Hospital Name: "+h.getHospitalName()+",Consultaion Fee: "+h.getConsultationFee()+"\n");
			}
		}
		else
		{
			System.out.println("No Hospitals Found.");
		}

	}
	public static double searchByHospitalName(Hospital_management[] hm,String search)
	{
		for(int i=0;i<hm.length;i++)
		{
			if(hm[i].getHospitalName().equalsIgnoreCase(search))
			{
				return hm[i].getConsultationFee();
			}	
		}
		return 0.0;
	}
	
	public static List<Hospital_management> sortbyConsultationFee(Hospital_management[] hm)
	{
		List<Hospital_management> arr=new ArrayList<>();
		for(Hospital_management hospital:hm)
		{
			arr.add(hospital);
		}
		if(arr.size()==0)
		{
			return null;
		}
		
		Collections.sort(arr,Comparator.comparingDouble(Hospital_management::getConsultationFee));
		return arr;
	}

	@Override
	void manageInventory() {
		System.out.println("Sufficient Inventory Available.");
	}
	public void display() {
		System.out.println("*********Welcome to the Hospital Management System*********"+"\n\n");
	}

}
