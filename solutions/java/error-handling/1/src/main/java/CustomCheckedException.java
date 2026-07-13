class CustomCheckedException extends Exception {
    String message;

    CustomCheckedException() {
        super();
    }

    CustomCheckedException(String message) {
        super(message);
    }

}
