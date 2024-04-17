package Practice;

public class company {
    empployee []empployees;
    int countemploy;
    company(){
        empployee []empployees = new empployee[100];
        countemploy = 0;
    }
    void addemployee(empployee Empployee){
        if(countemploy < empployees.length){
            empployees[countemploy] = Empployee;
            countemploy++;
        }else{
            System.out.println("sudah ppenuh karyawannya");
        }
    }
    void printall(){
        System.out.println("daftar pegawai nih");
        for(int i = 0; i < countemploy; i++){
            empployee Empployee = empployees[i];
            System.out.println("nama = " + Empployee.getName());
            System.out.println("id = " + Empployee.getId());
            System.out.println("dept = " + Empployee.getDepartement());
        }
    }
}

