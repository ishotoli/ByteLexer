package lightfish.byteLexer;
 class JParseNode extends P{  public  int parse(){int c;{c=cc(x);if(c=='o'){{c=cc(x);if(c=='i'){{c=cc(x);if(c=='n'){c=cc(x);if (isBlank(c)){t=H.JOIN;return x;}}endId();return x;}}endId();return x;}}if(c=='s'){{c=cc(x);if(c=='o'){{c=cc(x);if(c=='n'){c=cc(x);if (isBlank(c)){t=H.JSON;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}}