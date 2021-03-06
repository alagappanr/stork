package stork.module.ftp;

import stork.ad.*;
import stork.feather.*;
import stork.module.*;
import stork.scheduler.*;

public class FTPModule extends Module {
  public FTPModule() {
    super("Stork FTP Module", "ftp", "gsiftp", "gridftp");
    version = "1.0";
    author  = "Brandon Ross";
    email   = "bwross@buffalo.edu";
    description =
      "A module for interacting with FTP systems and derivatives thereof. "+
      "Supports RFC 2228 security extensions with GSSAPI, as well as a few "+
      "GridFTP extensions.";
  }

  public Resource select(URI uri, Credential credential) {
    URI endpoint = uri.endpointURI(), resource = uri.resourceURI();
    return new FTPSession(endpoint, credential).select(resource);
  }
}
