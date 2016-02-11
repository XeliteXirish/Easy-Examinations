package xelitexirish.com.easyexaminations.SubjectEnums;

import xelitexirish.com.easyexaminations.MainActivity;

public class Enum2012 {

    MainActivity activity;

    public Enum2012(MainActivity activity){
        this.activity = activity;
    }

    public SubjectEnum getEnum(){

        if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.MATHS)) {
            // Maths
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.MATHS20120;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.MATHS20121;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.MATHS20122;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.MATHS20123;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.ENGLISH)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.ENGLISH20120;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.ENGLISH20121;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.ENGLISH20132;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.ENGLISH20123;
            }
            // Irish
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.IRISH)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.IRISH20120;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.IRISH20121;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.IRISH20122;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.IRISH20123;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.FRENCH)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.FRENCH20120;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.FRENCH20121;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.FRENCH20122;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.FRENCH20123;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.GERMAN)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.GERMAN20120;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.GERMAN20121;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.GERMAN20122;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.GERMAN20123;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.PHYSICS)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return null;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return null;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.PHYSICS20122;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.PHYSICS20123;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.BIOLOGY)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return null;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return null;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.BIOLOGY20122;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.BIOLOGY20123;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.CHEMISTRY)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return null;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return null;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.CHEMISTRY20122;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.CHEMISTRY20123;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.GEOGRAPHY)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.GEOGRAPHY20120;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.GEOGRAPHY20121;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.GEOGRAPHY20122;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.GEOGRAPHY20123;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.HISTORY)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.HISTORY20120;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.HISTORY20121;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.HISTORY20122;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.HISTORY20123;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.ACCOUNTING)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.ACCOUNTING20120;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.ACCOUNTING20121;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.ACCOUNTING20122;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.ACCOUNTING20123;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.ECONOMICS)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.ECONOMICS20120;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.ECONOMICS20121;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.ECONOMICS20122;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.ECONOMICS20123;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.BUSINESS)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.BUSINESS20120;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.BUSINESS20121;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.BUSINESS20122;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.BUSINESS20123;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.TECHNOLOGY)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.TECHNOLOGY20120;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.TECHNOLOGY20121;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.TECHNOLOGY20122;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.TECHNOLOGY20123;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.HOMEEC)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.HOMEEC20120;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.HOMEEC20121;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.HOMEEC20122;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.HOMEEC20123;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.RELIGION)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.RELIGION20120;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.RELIGION20121;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.RELIGION20122;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.RELIGION20123;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.METALWORK)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.METALWORK20120;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.METALWORK20121;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.METALWORK20122;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.METALWORK20123;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.WOODWORK)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.WOODWORK20120;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.WOODWORK20121;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.WOODWORK20122;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.WOODWORK20123;
            }
        }
        return null;
    }

}
