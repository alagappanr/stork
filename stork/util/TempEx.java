package stork.util;

// A problem which cannot be recovered from.

@SuppressWarnings("serial")
public class TempEx extends RuntimeException {
  public TempEx(String message, Throwable cause) {
    super(message, cause);
  } public TempEx(String message) {
    super(message);
  }
}