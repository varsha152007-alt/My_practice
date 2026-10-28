class Main {
    public static void main(String[] args) {
    String s= "mam";
    int i=0;
    int j=s.length()-1;
    boolean ispalindrome=true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                break;
            }
            i++;
            j--;
            System.out.println(ispalindrome);
            }
        }
      
    }
