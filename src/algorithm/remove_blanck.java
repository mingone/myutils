package algorithm;

import java.io.File;

public class remove_blanck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = " 1.1 BASIC PROGRAMMING MODELOur study of algorithms is based upon implementing them as programs written in the Java programming language. We do so for several reasons:¡ö Our programs are concise, elegant, and complete descriptions of algorithms.¡ö Yo u   c a n   r u n   t h e   p r o g r a m s   t o   s t u d y   p r o p e r t i e s   o f   t h e   a l g o r i t h m s .¡ö Yo u   c a n   p u t   t h e   a l g o r i t h m s   i m m e d i a t e l y   t o   g o o d   u s e   i n   a p p l i c a t i o n s .These are important and significant advantages over the alternatives of working with English-language descriptions of algorithms.A potential downside to this approach is that we have to work with a specific pro-gramming language, possibly making it difficult to separate the idea of the algorithm from the details of its implementation. Our implementations are designed to mitigate this difficulty, by using programming constructs that are both found in many modern languages and needed to adequately describe the algorithms. We   u s e   o n l y   a   s m a l l   s u b s e t   o f   J a v a .   W h i l e   w e   s t o p   s h o r t   o f   f o r m a l l y   d e fi n i n g   t h e  subset that we use, you will see that we make use of relatively few Java constructs, and that we emphasize those that are found in many modern programming languages. The code that we present is complete, and our expectation is that you will download it and execute it, on our test data or test data of your own choosing.We   r e f e r   t o   t h e   p r o g r a m m i n g   c o n s t r u c t s ,   s o f t w a r e   l i b r a r i e s ,   a n d   o p e r a t i n g   s y s t e m  features that we use to implement and describe algorithms as our programming model. In this section and Section 1.2, we fully describe this programming model. The treat-ment is self-contained and primarily intended for documentation and for your refer-ence in understanding any code in the book. The model we describe is the same model introduced  in  our  book   An  Introduction  to  Programming  in  Java:  An  Interdisciplinary Approach, which provides a slower-paced introduction to the material.For  reference,  the  figure  on  the  facing  page  depicts  a  complete  Java  program  that illustrates many of the basic features of our programming model. We use this code for examples when discussing language features, but defer considering it in detail to page 46 (it implements a classic algorithm known as  binary search and tests it for an applica-tion  known  as     whitelist  filtering). We  assume  that  you  have  experience  programming in some modern language, so that you are likely to recognize many of these features in this code. Page references are included in the annotations to help you find answers to any questions that you might have. Since our code is somewhat stylized and we strive to make consistent use of various Java idioms and constructs, it is worthwhile even for experienced Java programmers to read the information in this section";
		int a = 0;
		int b = 0;
		int i = 5;
		a = s.indexOf("   ");
		b = s.indexOf("   ", a+1);
		for(;i>0;){
			if (Math.abs(a - b) < 60) {
				System.out.println("a=" + a);
				System.out.println("b=" + b);
				System.out.println(" "+s.substring(a, b).replace(" ", "")+" ");
				
				System.out.println(a+" "+b);
			}else {
				System.out.println("---");
				i--;
			}

			a = s.indexOf("   ",b);
			b = s.indexOf("   ", b+1);
		}
		
 	}
}
