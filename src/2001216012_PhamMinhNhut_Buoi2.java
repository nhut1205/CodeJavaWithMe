
import java.util.Scanner;

public class Bai1 {
	//Hàm so sánh 2 số 
	public static int soSanh2So(int a, int b) {
		  if (a > b)
			  return a;
		  else 
			  return b;
		}
	//Hàm tìm max trong 3 số
	public static int maxTrong3So(int a , int b , int c)
	{
		int maxNumber;
		return maxNumber = Math.max(Math.max(a, b), c);
	}
	//Hàm tìm min trong 3 số
	public static int minTrong3So(int a , int b , int c)
	{
		int minNumber;
		return minNumber = Math.min(Math.min(a, b), c);
	}
	//Hàm kiểm tra có phri năm nhuận hay khôg
	public static boolean checkYearNhuan(int year)
	{
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
        	return true;
        } else {
        	return false;
        }
	}
	//Hàm giải phương trình bậc 2
	public static void giaiPTB2(int a , int b , int c)
	{
        double delta, x1, x2;
        if(a == 0) {

            if(b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
            	double value = -c/b;
                System.out.println("Phương trình có nghiệm duy nhất : "+ value);
            }
        } else {
            delta = b*b - 4*a*c;
            if(delta > 0) {
                x1 = (-b+Math.sqrt(delta))/(2*a);
                x2 = (-b-Math.sqrt(delta))/(2*a);
                System.out.println("Nghiệm x1 : " +x1);
                System.out.println("Nghiệm x2 : " +x2);
            } else if ( delta == 0) {
            	double kep = -b/a*2;
                System.out.println("Phương trình có nghiệm kép : " + kep);
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
	}
	
	public static void checkMonth(int month , int year)
	{
	switch (month) {
	case 1 : case 3: case 5: case 7 : case 8 : case 10 : case 12:
	System.out.println("31");
	break;
	case 4 : case 6: case 9 : case 11 :
		System.out.println("30");
	break;
	case 2 :
		if (checkYearNhuan(year))
			System.out.println("29");
		else
			System.out.println("28");
		break;
	default :
		System.out.println("Khong dung dinh dang thang!!");
	}
	}
	
	public static void checkDiem(double diem)
	{
		if (diem > 10)
			System.out.println("Khong dung dinh dang!!");
		else if (diem >= 8.5)
		System.out.println("A");
		else if (diem >= 7)
			System.out.println("B");
		else if (diem >= 5.5)
			System.out.println("C");
		else if (diem >= 4)
			System.out.println("D");
		else 
			System.out.println("F");
	}
	
	public static int tinhtienDien(int soDienCu, int soDienMoi) {
	    if (soDienCu > soDienMoi) {
	        System.out.println("Chỉ số điện cũ không được lớn hơn chỉ số điện mới.");
	        return 0; 
	    }

	    int soDien = soDienMoi - soDienCu;
	    int tienDien = 0;

	    if (soDien <= 50 && soDien > 0) {
	        tienDien = soDien * 1480;
	    } else if (soDien > 50 && soDien <= 100) {
	        tienDien = 50 * 1480 + (soDien - 50) * 1533;
	    } else if (soDien > 100 && soDien <= 200) {
	        tienDien = 50 * 1480 + 50 * 1533 + (soDien - 100) * 1786;
	    } else if (soDien > 200 && soDien <= 300) {
	        tienDien = 50 * 1480 + 50 * 1533 + 100 * 1786 + (soDien - 200) * 2242;
	    } else {
	        tienDien = 50 * 1480 + 50 * 1533 + 100 * 1786 + 100 * 2242 + (soDien - 300) * 2503;
	    }

	    return tienDien;
	}

	
	public static boolean checkThang(int thang)
	{
		if (thang > 0 && thang < 12)
		return true;
			return false;
	}
	
	public static boolean checkNam(int nam)
	{
		if (nam > 0)
		return true;
			return false;
	}
	
	public static boolean checkNgay(int ngay , int thang , int nam)
	{
		if (checkThang(thang) == true)
		{
		if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12)
		{
			if (ngay > 31 && ngay <0)
				return false;
			else return true;
		}

		else if (thang == 4 || thang == 6 || thang == 9 || thang == 11)
		{
			if (ngay > 30 && ngay <0)
				return false;
			else return true;
		}
		else
		{
			if (checkYearNhuan(nam) == true && checkNam(nam) == true)
			{
				if (ngay > 29 && ngay < 0)
					return false;
			}
			return true;
		}
		
		}
		else {
			return false;
		}
	}

	public static int demUoc(int n)
	{
		int count  = 0;
		 for (int i = 1 ; i <= n ; i++)
		 {
			 if (n % i == 0)
				 count++;
		 }
		return count;
	}
	
	public static void lietKeUocLe(int n)
	{
		for (int i = 1 ; i <= n ; i++)
		{
			if (n % i == 0 && i % 2 != 0)
				System.out.print(i +" , ");
		}
	}
	
	public static boolean soNT(int n)
	{
		int count = 0;
		if (n < 2 )
		return false;

		else {
			for (int i = 2 ; i <= Math.sqrt(n) ; i++)
			{
				if (n % i == 0)
				count++;
			}
		}
		
		if (count == 0)
			return true;
		else
			return false;
	}
	
	public static int tongDaySo(int a)
	{
		int sum = 0;
		while (a !=0)
		{
			sum +=a;
		}
		return sum;
	}
	
	//Hàm đếm chữ số lẽ trong số tự nhiên N , ví dụ : 12345 là 3
	public static int demSoLeTrongN(int n)
	{
		int count = 0;
		while (n != 0 )
		{
			int temp = n % 10;
			if (temp % 2 == 1)
				count++;
			n /= 10;
		}
		return count;
	}
	
	public static int tongChanTrongN(int n)
	{
		int sum = 0;
		while (n !=0)
		{
			int temp = n % 10;
			if (temp % 2 ==0)
				sum += temp;
			n /= 10;
		}
		return sum;
	}
	
	public static void veHCN(int cd , int cr)
	{
		for (int i = 0 ; i < cr ; i++)
		{
			for (int j = 0 ; j < cd ; j++) {
				System.out.print("*");}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		 	int luachon = -1;
	        int a, b , c;
            System.out.println("-----------------Menu--------------");
            System.out.println("Enter your choice");
            System.out.println("1.In ra dòng Hello Java!!");
            System.out.println("2.Số lớn nhất trong 2 số.");
            System.out.println("3.Số lớn nhất , nhỏ nhất trong 3 số.");
            System.out.println("4.Giải phương trình bậc 2.");
            System.out.println("5.Kiểm tra năm phải là năm nhuận hay không.");
            System.out.println("6.Xem ngày trong tháng.");
            System.out.println("7.Xếp loại theo điểm");
            System.out.println("8.Tính số tiền điện dựa theo số điện cũ và mới.");
            System.out.println("9.Kiểm tra ngày có hợp lệ không");
            System.out.println("10.Đếm số lượng ước của một số.");
            System.out.println("11.Liệt kê số ước lẻ của một số.");
            System.out.println("14.Kiểm tra xem phải là số nguyên tố không.");
            System.out.println("15.Nhập vào dãy số tính tổng các số.");
            System.out.println("16.Đếm số lẻ trong số tự nhiên N.");
            System.out.println("17.Tổng chẵn trong số tự nhiên N.");
            System.out.println("18.Vẽ hình chữ nhật theo chiều dai , rộng.");
            System.out.println("--------------------------------------");

	        while (luachon != 0) {
	        	System.out.println("Nhập lựa chọn hoặc 0 để thoát");
	            Scanner input = new Scanner(System.in);
	            luachon = input.nextInt();

	            switch (luachon) {
	                case 1:
	                    System.out.println("Hello Java");
	                    break;
	                case 2:
	                    Scanner num1 = new Scanner(System.in);
	                    System.out.print("Enter your value a : ");
	                    a = num1.nextInt();
	                    System.out.print("Enter your value b : ");
	                    b = num1.nextInt();
	                    
	                    System.out.println(soSanh2So(a, b));
	                case 3:
	                    
	                	Scanner scanner = new Scanner(System.in);
	                	
	                    System.out.print("Enter your value a : ");
	                     a = scanner.nextInt();
	                    System.out.print("Enter your value b : ");
	                     b = scanner.nextInt();
	                    System.out.print("Enter your value c : ");
	                     c = scanner.nextInt();


	                    System.out.println("Số lớn nhất là: " + maxTrong3So(a, b, c));
	                    System.out.println("Số nhỏ nhất là: " + minTrong3So(a, b, c));
	                    break;
	                case 4:
	                	Scanner scanner1 = new Scanner(System.in);
	                    System.out.print("Enter your value a : ");
	                     a = scanner1.nextInt();
	                    System.out.print("Enter your value b : ");
	                     b = scanner1.nextInt();
	                    System.out.print("Enter your value c : ");
	                     c = scanner1.nextInt();
	                    giaiPTB2(a, b, c);
	                	break;
	                case 5: 
	                	int year;
	                	Scanner year1 = new Scanner(System.in);
	                	System.out.print("Enter year value : ");
	                	year = year1.nextInt();
	                	if (checkYearNhuan(year))
	                	{
	                		System.out.println("Năm nhuận.");
	                	} else {
	                		System.out.println("Không là năm nhuận.");
	                	}
	                	break;
	                case 6:
	                	int month;
	                	Scanner month1 = new Scanner(System.in);
	                	System.out.print("Enter month value : ");
	                	month = month1.nextInt();
	                	if (month == 2){
	                	Scanner year2 = new Scanner(System.in);
	                	System.out.print("Enter year value : ");
	                	year = year2.nextInt();
	                	checkMonth(month , year);
	                	}
	                	else
	                	{
	                		year = 0;
	                		checkMonth(month, year);
	                	}
	                	break;
	                case 7:
	                	double point ;
	                	Scanner point1 = new Scanner(System.in);
	                	System.out.print("Enter Point value : ");
	                	point = point1.nextDouble();
	                	checkDiem(point);
	                	break;
	                case 8:
	                	int soDienCu , soDienMoi;
	                	Scanner soDienCuI= new Scanner(System.in);
	                	System.out.println("Nhap so dien cu : ");
	                	soDienCu = soDienCuI.nextInt();
	                	Scanner soDienMoiI= new Scanner(System.in);
	                	System.out.println("Nhap so dien moi :");
	                	soDienMoi = soDienMoiI.nextInt();
	                	tinhtienDien(soDienCu, soDienMoi);
	                	break;
	                case 9:
	                	int date , month2 , year2;
	                	Scanner dateI = new Scanner(System.in);
	                	System.out.print("Enter date : ");
	                	date = dateI.nextInt();
	                	Scanner monthI = new Scanner(System.in);
	                	System.out.print("Enter month : ");
	                	month2 = monthI.nextInt();
	                	Scanner yearI = new Scanner(System.in);
	                	System.out.print("Enter year : ");
	                	year2 = yearI.nextInt();
	                	if (checkNgay(date,month2,year2) == false) {
	                	while (checkNgay(date,month2,year2) == false)
	                	{
		                	System.out.print("Enter date : ");
		                	date = dateI.nextInt();
		                	System.out.print("Enter month : ");
		                	month2 = monthI.nextInt();
		                	System.out.print("Enter year : ");
		                	year2 = yearI.nextInt();
	                	}
	                	}
	                	else
	                	{
	                		System.out.println(""+date+"/"+month2+"/"+year2);
	                	}
	                	
	                	break;
	                case 10:
	                	int soTuNhien;
	                	Scanner soTuNhienI = new Scanner(System.in);
	                	System.out.print("Enter you number value : ");
	                	soTuNhien = soTuNhienI.nextInt();
	                	System.out.println("Số lượng ước của số : "+demUoc(soTuNhien));
	                	break;
	                case 11:
	                	int soTuNhien2;
	                	Scanner soTuNhienII = new Scanner(System.in);
	                	System.out.print("Enter you number value : ");
	                	soTuNhien2 = soTuNhienII.nextInt();
	                	System.out.print("Các ước lẻ của "+soTuNhien2 + " :");
	                	lietKeUocLe(soTuNhien2);
	                	System.out.println();
	                	break;
	                case 14 :
	                	int soNguyenTo;
	                	Scanner soNguyenToI = new Scanner(System.in);
	                	System.out.print("Enter number value : ");
	                	soNguyenTo = soNguyenToI.nextInt();
	                	if (soNT(soNguyenTo))
	                		System.out.println(soNguyenTo + " là số nguyên tố.");
	                	else 
	                		System.out.println(soNguyenTo + " không là số nguyên tố.");
	                	break;
	                case 15:
	                	int daySo = -1;
	                	while (daySo != 0) {
	                		System.out.println("Enter value number : ");
		                	Scanner tongDaySoI = new Scanner(System.in);
	                		daySo = tongDaySoI.nextInt();
	                		System.out.println("Kết quả "+tongDaySo(daySo));
	                	}
	                	break;
	                case 16:
	                	int soN;
	                	Scanner soNI = new Scanner(System.in);
	                	System.out.print("Enter number value : ");
	                	soN = soNI.nextInt();
	                	System.out.println("Số lượng số lẻ trong "+soN+" là "+demSoLeTrongN(soN));
	                	break;
	                case 17:
	                	int soN2;
	                	Scanner soN2I = new Scanner(System.in);
	                	System.out.print("Enter number value : ");
	                	soN2 = soN2I.nextInt();
	                	System.out.println("Tổng chẵn trong số N : "+tongChanTrongN(soN2));
	                	break;
	                case 18:
	                	int cd , cr;
	                	Scanner cdI = new Scanner(System.in);
	                	System.out.print("Nhập vào chiều dài : ");
	                	cd = cdI.nextInt();
	                	Scanner crI = new Scanner(System.in);
	                	System.out.print("Nhập vào chiều rộng : ");
	                	cr = crI.nextInt();
	                	veHCN(cd, cr);
	                	break;
	                default :
	                System.out.println("Exit process!!!");
	                System.exit(0);
	            }

	        }
		}
}