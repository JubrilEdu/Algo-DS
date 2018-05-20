//package HackerRank;
//
//import java.io.IOException;
//import java.util.Iterator;
//import java.io.Reader;
//
//class SolutionIter implements Iterable<Integer> {
//    Reader reader;
//
//    public SolutionIter(Reader inp) {
//        this.reader = inp;
//    }
//
////    public Iterator<Integer> iterator() {
////        return  new Iterator<Integer>() {
////            @Override
////            public boolean hasNext() {
////                try {
////                    reader.mark(1);
////                    if (reader.read() == '\n') {
////                        return true;
////                    }
////                    reader.reset();
////                    return false;
////                } catch (IOException e) {
////                    return false;
////                }
////            }
////
////            @Override
////            public Integer next() {
////                try {
////                    if (reader.read()< Integer.MAX_VALUE || reader.read()> Integer.MIN_VALUE){
////                        if (Character.getNumericValue(reader.read())==10)
////                        return reader.read() - '0';
////                    }else {
////                        return 0;
////                    }
////                } catch (IOException e) {
////                    e.printStackTrace();
////                    return 0;
////                }
////            }
////
////
////        };
////    }
//}
//
///**
// * Example usage:
// *
// * for (Integer x : new SolutionIter(reader)) {
// *     System.out.println(x);
// * }
// */