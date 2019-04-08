public class Main {

    public static void main(String[] args) {
            int start;
                    int end;
        try{
            start = Integer.parseInt(args[1]);
            end = Integer.parseInt(args[2]);
            if(end<start)
            {
                throw new IllegalArgumentException("End cannot be bigger than begin!");
            }
            if(end<0||start<0)
            {
                throw new IllegalArgumentException("Position cannot be less than zero!");
            }

            System.out.println(args[0].substring(start, end));
        }
        catch(Exception e){
            System.out.println("Exception occured. "+e.getMessage());
            System.exit(1);
        }


    }
}
