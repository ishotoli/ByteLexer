package lightfish.byteLexer;
 class RParseNode extends P{  public  int parse(){int c;switch (cc(x)){
case 'e' :{switch (cc(x)){
case 'n' :{{c=cc(x);if(c=='a'){{c=cc(x);if(c=='m'){{c=cc(x);if(c=='e'){c=cc(x);if (isBlank(c)){t=H.RENAME;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 'm' :{{c=cc(x);if(c=='o'){{c=cc(x);if(c=='v'){{c=cc(x);if(c=='e'){c=cc(x);if (isBlank(c)){t=H.REMOVE;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 'l' :{{c=cc(x);if(c=='a'){{c=cc(x);if(c=='y'){{c=cc(x);if(c=='l'){{c=cc(x);if(c=='o'){{c=cc(x);if(c=='g'){c=cc(x);if (isBlank(c)){t=H.RELAYLOG;return x;}}endId();return x;}}endId();return x;}}if(c=='_'){{c=cc(x);if(c=='l'){{c=cc(x);if(c=='o'){{c=cc(x);if(c=='g'){{c=cc(x);if(c=='_'){{c=cc(x);if(c=='f'){{c=cc(x);if(c=='i'){{c=cc(x);if(c=='l'){{c=cc(x);if(c=='e'){c=cc(x);if (isBlank(c)){t=H.RELAY_LOG_FILE;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='p'){{c=cc(x);if(c=='o'){{c=cc(x);if(c=='s'){c=cc(x);if (isBlank(c)){t=H.RELAY_LOG_POS;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='t'){{c=cc(x);if(c=='h'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='d'){c=cc(x);if (isBlank(c)){t=H.RELAY_THREAD;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}return x;}}endId();return x;}}if(c=='e'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='s'){{c=cc(x);if(c=='e'){c=cc(x);if (isBlank(c)){t=H.RELEASE;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='o'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='d'){c=cc(x);if (isBlank(c)){t=H.RELOAD;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 'g' :{{c=cc(x);if(c=='e'){{c=cc(x);if(c=='x'){{c=cc(x);if(c=='p'){c=cc(x);if (isBlank(c)){t=H.REGEXP;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 'f' :{{c=cc(x);if(c=='e'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='n'){{c=cc(x);if(c=='c'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='s'){c=cc(x);if (isBlank(c)){t=H.REFERENCES;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 'd' :{{c=cc(x);if(c=='u'){{c=cc(x);if(c=='n'){{c=cc(x);if(c=='d'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='n'){{c=cc(x);if(c=='t'){c=cc(x);if (isBlank(c)){t=H.REDUNDANT;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='o'){{c=cc(x);if(c=='f'){{c=cc(x);if(c=='i'){{c=cc(x);if(c=='l'){{c=cc(x);if(c=='e'){c=cc(x);if (isBlank(c)){t=H.REDOFILE;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='_'){{c=cc(x);if(c=='b'){{c=cc(x);if(c=='u'){{c=cc(x);if(c=='f'){{c=cc(x);if(c=='f'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='_'){{c=cc(x);if(c=='s'){{c=cc(x);if(c=='i'){{c=cc(x);if(c=='z'){{c=cc(x);if(c=='e'){c=cc(x);if (isBlank(c)){t=H.REDO_BUFFER_SIZE;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 'c' :{{c=cc(x);if(c=='o'){{c=cc(x);if(c=='v'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='r'){c=cc(x);if (isBlank(c)){t=H.RECOVER;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 'b' :{{c=cc(x);if(c=='u'){{c=cc(x);if(c=='i'){{c=cc(x);if(c=='l'){{c=cc(x);if(c=='d'){c=cc(x);if (isBlank(c)){t=H.REBUILD;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 'a' :{{c=cc(x);if(c=='d'){{c=cc(x);if(c=='_'){{c=cc(x);if(c=='o'){{c=cc(x);if(c=='n'){{c=cc(x);if(c=='l'){{c=cc(x);if(c=='y'){c=cc(x);if (isBlank(c)){t=H.READ_ONLY;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='w'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='i'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='e'){c=cc(x);if (isBlank(c)){t=H.READ_WRITE;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='s'){c=cc(x);if (isBlank(c)){t=H.READS;return x;}}return x;}}if(c=='l'){c=cc(x);if (isBlank(c)){t=H.REAL;return x;}}endId();return x;}}
case 'v' :{{c=cc(x);if(c=='e'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='s'){{c=cc(x);if(c=='e'){c=cc(x);if (isBlank(c)){t=H.REVERSE;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='o'){{c=cc(x);if(c=='k'){{c=cc(x);if(c=='e'){c=cc(x);if (isBlank(c)){t=H.REVOKE;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 't' :{{c=cc(x);if(c=='u'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='n'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='d'){{c=cc(x);if(c=='_'){{c=cc(x);if(c=='s'){{c=cc(x);if(c=='q'){{c=cc(x);if(c=='l'){{c=cc(x);if(c=='s'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='e'){c=cc(x);if (isBlank(c)){t=H.RETURNED_SQLSTATE;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='s'){c=cc(x);if (isBlank(c)){t=H.RETURNS;return x;}}return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 's' :{{c=cc(x);if(c=='e'){{c=cc(x);if(c=='t'){c=cc(x);if (isBlank(c)){t=H.RESET;return x;}}endId();return x;}}if(c=='u'){{c=cc(x);if(c=='m'){{c=cc(x);if(c=='e'){c=cc(x);if (isBlank(c)){t=H.RESUME;return x;}}endId();return x;}}endId();return x;}}if(c=='t'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='i'){{c=cc(x);if(c=='c'){{c=cc(x);if(c=='t'){c=cc(x);if (isBlank(c)){t=H.RESTRICT;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='o'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='e'){c=cc(x);if (isBlank(c)){t=H.RESTORE;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='i'){{c=cc(x);if(c=='g'){{c=cc(x);if(c=='n'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='l'){c=cc(x);if (isBlank(c)){t=H.RESIGNAL;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 'q' :{{c=cc(x);if(c=='u'){{c=cc(x);if(c=='i'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='e'){c=cc(x);if (isBlank(c)){t=H.REQUIRE;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 'p' :{{c=cc(x);if(c=='a'){{c=cc(x);if(c=='i'){{c=cc(x);if(c=='r'){c=cc(x);if (isBlank(c)){t=H.REPAIR;return x;}}endId();return x;}}endId();return x;}}if(c=='e'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='b'){{c=cc(x);if(c=='l'){{c=cc(x);if(c=='e'){c=cc(x);if (isBlank(c)){t=H.REPEATABLE;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}return x;}}endId();return x;}}endId();return x;}}if(c=='l'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='c'){{c=cc(x);if(c=='e'){c=cc(x);if (isBlank(c)){t=H.REPLACE;return x;}}endId();return x;}}endId();return x;}}if(c=='i'){{c=cc(x);if(c=='c'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='_'){{c=cc(x);if(c=='d'){{c=cc(x);if(c=='o'){{c=cc(x);if(c=='_'){{c=cc(x);if(c=='d'){{c=cc(x);if(c=='b'){c=cc(x);if (isBlank(c)){t=H.REPLICATE_DO_DB;return x;}}endId();return x;}}if(c=='t'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='b'){{c=cc(x);if(c=='l'){{c=cc(x);if(c=='e'){c=cc(x);if (isBlank(c)){t=H.REPLICATE_DO_TABLE;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='r'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='w'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='i'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='_'){{c=cc(x);if(c=='d'){{c=cc(x);if(c=='b'){c=cc(x);if (isBlank(c)){t=H.REPLICATE_REWRITE_DB;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='i'){{c=cc(x);if(c=='g'){{c=cc(x);if(c=='n'){{c=cc(x);if(c=='o'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='_'){{c=cc(x);if(c=='d'){{c=cc(x);if(c=='b'){c=cc(x);if (isBlank(c)){t=H.REPLICATE_IGNORE_DB;return x;}}endId();return x;}}if(c=='t'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='b'){{c=cc(x);if(c=='l'){{c=cc(x);if(c=='e'){c=cc(x);if (isBlank(c)){t=H.REPLICATE_IGNORE_TABLE;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='w'){{c=cc(x);if(c=='i'){{c=cc(x);if(c=='l'){{c=cc(x);if(c=='d'){{c=cc(x);if(c=='_'){{c=cc(x);if(c=='i'){{c=cc(x);if(c=='g'){{c=cc(x);if(c=='n'){{c=cc(x);if(c=='o'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='_'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='b'){{c=cc(x);if(c=='l'){{c=cc(x);if(c=='e'){c=cc(x);if (isBlank(c)){t=H.REPLICATE_WILD_IGNORE_TABLE;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='d'){{c=cc(x);if(c=='o'){{c=cc(x);if(c=='_'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='b'){{c=cc(x);if(c=='l'){{c=cc(x);if(c=='e'){c=cc(x);if (isBlank(c)){t=H.REPLICATE_WILD_DO_TABLE;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='i'){{c=cc(x);if(c=='o'){{c=cc(x);if(c=='n'){c=cc(x);if (isBlank(c)){t=H.REPLICATION;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 'o' :{{c=cc(x);if(c=='r'){{c=cc(x);if(c=='g'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='n'){{c=cc(x);if(c=='i'){{c=cc(x);if(c=='z'){{c=cc(x);if(c=='e'){c=cc(x);if (isBlank(c)){t=H.REORGANIZE;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
default:endId();return x;
}}
case 'l' :{{c=cc(x);if(c=='i'){{c=cc(x);if(c=='k'){{c=cc(x);if(c=='e'){c=cc(x);if (isBlank(c)){t=H.RLIKE;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 't' :{{c=cc(x);if(c=='r'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='e'){c=cc(x);if (isBlank(c)){t=H.RTREE;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 'a' :{{c=cc(x);if(c=='n'){{c=cc(x);if(c=='g'){{c=cc(x);if(c=='e'){c=cc(x);if (isBlank(c)){t=H.RANGE;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 'i' :{{c=cc(x);if(c=='g'){{c=cc(x);if(c=='h'){{c=cc(x);if(c=='t'){c=cc(x);if (isBlank(c)){t=H.RIGHT;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}
case 'o' :{{c=cc(x);if(c=='u'){{c=cc(x);if(c=='t'){{c=cc(x);if(c=='e'){{c=cc(x);if(c=='r'){c=cc(x);if (isBlank(c)){t=H.ROUTER;return x;}}return x;}}if(c=='i'){{c=cc(x);if(c=='n'){{c=cc(x);if(c=='e'){c=cc(x);if (isBlank(c)){t=H.ROUTINE;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='l'){{c=cc(x);if(c=='l'){{c=cc(x);if(c=='b'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='c'){{c=cc(x);if(c=='k'){c=cc(x);if (isBlank(c)){t=H.ROLLBACK;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='u'){{c=cc(x);if(c=='p'){c=cc(x);if (isBlank(c)){t=H.ROLLUP;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='w'){{c=cc(x);if(c=='_'){{c=cc(x);if(c=='f'){{c=cc(x);if(c=='o'){{c=cc(x);if(c=='r'){{c=cc(x);if(c=='m'){{c=cc(x);if(c=='a'){{c=cc(x);if(c=='t'){c=cc(x);if (isBlank(c)){t=H.ROW_FORMAT;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='c'){{c=cc(x);if(c=='o'){{c=cc(x);if(c=='u'){{c=cc(x);if(c=='n'){{c=cc(x);if(c=='t'){c=cc(x);if (isBlank(c)){t=H.ROW_COUNT;return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}endId();return x;}}if(c=='s'){c=cc(x);if (isBlank(c)){t=H.ROWS;return x;}}return x;}}endId();return x;}}
default:endId();return x;
}}}