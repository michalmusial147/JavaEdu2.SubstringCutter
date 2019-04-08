public class Main {

    public static void main(String[] args) {
            int start;
                    int end;
        try{
            start = Integer.parseInt(args[1]);
            end = Integer.parseInt(args[2]);
            if(end<start || end<0 || start<0)
                throw new IllegalArgumentException("Wrong argument ");
            System.out.println(args[0].substring(start, end));
        }
        catch(Exception e){
            System.out.println("Exception occured");
            System.exit(1);
        }


    }
}
