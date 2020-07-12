package exception;
class CustomException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message = null;

    public CustomException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

public class activity24 {
    public static void main(String[] a){
        try {
            activity24.exceptionTest("Will print to console");
            activity24.exceptionTest(null);
            activity24.exceptionTest("Won't execute");
        } catch(CustomException mae) {
            System.out.println("Inside catch block: " + mae.getMessage());
        }
    }

    static void exceptionTest(String str) throws CustomException {
        if(str == null) {
            throw new CustomException("String value is null");
        } else {
            System.out.println(str);
        }
    }
}
