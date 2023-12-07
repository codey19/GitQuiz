public class Main implements Inter{
    public static void main(String[] args){

    }

    @Override
    public int adding(int start, int end) {
        int r = 0;
        for(int i = start; i <= end; i++)
            r += i;
        return r;
    }
}
