package main.figures.exception;

public class FiguresException extends Exception {

        private FiguresErrorCode errorCode;

        public FiguresErrorCode getErrorCode(){
            return errorCode;
        }

        public FiguresException(FiguresErrorCode errorCode) {
            this.errorCode = errorCode;
        }
}
