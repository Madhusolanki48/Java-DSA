public class Java2_AccessModifiers {
        public static void main(String[] args) {
            BankAccount myAcc= new BankAccount();
            myAcc.username= "MadhuSolanki" ;
            myAcc.setPassword("abcdefghi");
            
        }
    }
    class BankAccount{
        public String username;
        private String password;
        public void setPassword(String pwd){
            password=pwd;
        }
    }
    
    

