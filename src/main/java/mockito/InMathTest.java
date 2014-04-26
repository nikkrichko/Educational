//package mockito;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.Mockito;
//import org.mockito.stubbing.Stubber;
//
//import static junit.framework.Assert.assertEquals;
//import static org.mockito.Mockito.doReturn;
//import static org.mockito.Mockito.when;
//
///**
// * Created by никита on 22.02.14.
// */
//public class InMathTest {
//    OutMath out;
//    InMath in;
//
//    @Before
//    public void setUp() throws Exception {
//        out = Mockito.mock(OutMath.class);
//
//    }
//
//    @Test
//    public void testSumm() throws Exception {
//        createChain().when(out.getB());
//        when(out.getA()).thenReturn(5);
////        when(out.getB()).thenReturn(2).thenReturn(1);
////        when(out.getB()).thenReturn(1);
//
////        in = new InMath(out);
////        in.summ();
//       doReturn(2).doAnswer(new Answer() {
//            @Override
//            public Object answer(InvocationOnMock invocation) throws Throwable {
//                return null;
//            }
//        }).when(out.getB());
////        verify(out, times(0)).getA();
//        assertEquals(2, out.getB());
//        assertEquals(1, out.getB());
//
//    }
//
////    private static Stubber createChain() {
////        return do;
////    }
//
//    @Test
//    public void testRazn() throws Exception {
//
//    }
//
//    @Test
//    public void testPrint() throws Exception {
//
//    }
//}
