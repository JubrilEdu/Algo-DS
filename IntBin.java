public class IntBin {

    public static void main(String[] args) {
        IntBin intBin = new IntBin();
        intBin.convert(9);
    }

    public void convert(Integer integer){
        char[] arr = {0,0,0,0,0,0,0,0};

        for (int i = 0; i < Integer.toBinaryString(integer).length() ; i++) {
            arr [i + Integer.toBinaryString(integer).length()] = Integer.toBinaryString(integer).charAt(i);
        }
        char itemCheckMark = arr[0];
        String sectionIndex = arr[arr.length - 2] +""+ arr[arr.length-1];
        String content = "";
        for (int i = 1; i < 6;i++){
                content = content + arr[i];
        }

        // have an object that has a value for content and a boolean for check
        // have a hashmap for section index to array of object
        // use hashmap to build UI
    }
}

