package lightfish.byteLexer;
 class UParseNode extends P{  public  int parse(){int c;switch (cc(x)){
case 'n' :{switch (cc(x)){
case 'l' :{{c=cc(x);if(c=='o'){{c=cc(x);if(c=='c'){{c=cc(x);if(c=='k'){c=cc(x);if (isBlank(c)){t=H.UNLOCK;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 'k' :{{c=cc(x);if(c=='n'){{c=cc(x);if(c=='o'){{c=cc(x);if(c=='w'){{c=cc(x);if(c=='n'){c=cc(x);if (isBlank(c)){t=H.UNKNOWN;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 'i' :{{c=cc(x);if(c=='n'){{c=cc(x);if(c=='s'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='l'){{c=cc(x);if(c=='l'){c=cc(x);if (isBlank(c)){t=H.UNINSTALL;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='c'){{c=cc(x);if(c=='o'){{c=cc(x);if(c=='d'){{c=cc(x);if(c=='e'){c=cc(x);if (isBlank(c)){t=H.UNICODE;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='q'){{c=cc(x);if(c=='u'){{c=cc(x);if(c=='e'){c=cc(x);if (isBlank(c)){t=H.UNIQUE;return x;}}endId();return x;}}endId();return x;}}if(c=='o'){{c=cc(x);if(c=='n'){c=cc(x);if (isBlank(c)){t=H.UNION;return x;}}endId();return x;}}endId();return x;}}
case 'd' :{{c=cc(x);if(c=='e'){{c=cc(x);if(c=='f'){{c=cc(x);if(c=='i'){{c=cc(x);if(c=='n'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='d'){c=cc(x);if (isBlank(c)){t=H.UNDEFINED;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='o'){{c=cc(x);if(c=='f'){{c=cc(x);if(c=='i'){{c=cc(x);if(c=='l'){{c=cc(x);if(c=='e'){c=cc(x);if (isBlank(c)){t=H.UNDOFILE;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='_'){{c=cc(x);if(c=='b'){{c=cc(x);if(c=='u'){{c=cc(x);if(c=='f'){{c=cc(x);if(c=='f'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='_'){{c=cc(x);if(c=='s'){{c=cc(x);if(c=='i'){{c=cc(x);if(c=='z'){{c=cc(x);if(c=='e'){c=cc(x);if (isBlank(c)){t=H.UNDO_BUFFER_SIZE;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}return x;}}endId();return x;}}
case 't' :{{c=cc(x);if(c=='i'){{c=cc(x);if(c=='l'){c=cc(x);if (isBlank(c)){t=H.UNTIL;return x;}}endId();return x;}}endId();return x;}}
case 'c' :{{c=cc(x);if(c=='o'){{c=cc(x);if(c=='m'){{c=cc(x);if(c=='m'){{c=cc(x);if(c=='i'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='d'){c=cc(x);if (isBlank(c)){t=H.UNCOMMITTED;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 's' :{{c=cc(x);if(c=='i'){{c=cc(x);if(c=='g'){{c=cc(x);if(c=='n'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='d'){c=cc(x);if (isBlank(c)){t=H.UNSIGNED;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
default:endId();return x;
}}
case 'd' :{{c=cc(x);if(c=='f'){{c=cc(x);if(c=='_'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='u'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='n'){{c=cc(x);if(c=='s'){c=cc(x);if (isBlank(c)){t=H.UDF_RETURNS;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 't' :{{c=cc(x);if(c=='c'){{c=cc(x);if(c=='_'){{c=cc(x);if(c=='d'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='e'){c=cc(x);if (isBlank(c)){t=H.UTC_DATE;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='t'){{c=cc(x);if(c=='i'){{c=cc(x);if(c=='m'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='s'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='m'){{c=cc(x);if(c=='p'){c=cc(x);if (isBlank(c)){t=H.UTC_TIMESTAMP;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 's' :{{c=cc(x);if(c=='a'){{c=cc(x);if(c=='g'){{c=cc(x);if(c=='e'){c=cc(x);if (isBlank(c)){t=H.USAGE;return x;}}endId();return x;}}endId();return x;}}if(c=='e'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='_'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='s'){{c=cc(x);if(c=='o'){{c=cc(x);if(c=='u'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='c'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='s'){c=cc(x);if (isBlank(c)){t=H.USER_RESOURCES;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}return x;}}if(c=='_'){{c=cc(x);if(c=='f'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='m'){c=cc(x);if (isBlank(c)){t=H.USE_FRM;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}return x;}}if(c=='i'){{c=cc(x);if(c=='n'){{c=cc(x);if(c=='g'){c=cc(x);if (isBlank(c)){t=H.USING;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 'p' :{{c=cc(x);if(c=='d'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='e'){c=cc(x);if (isBlank(c)){t=H.UPDATE;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='g'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='d'){{c=cc(x);if(c=='e'){c=cc(x);if (isBlank(c)){t=H.UPGRADE;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
default:endId();return x;
}}}