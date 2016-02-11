package xelitexirish.com.easyexaminations.SubjectEnums;

import xelitexirish.com.easyexaminations.MainActivity;

public class Enum2011 {

    MainActivity activity;

    public Enum2011(MainActivity activity){
        this.activity = activity;
    }

    public SubjectEnum getEnum(){

        if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.MATHS)) {
            // Maths
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.MATHS20110;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.MATHS20111;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.MATHS20112;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.MATHS20113;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.ENGLISH)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.ENGLISH20110;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.ENGLISH20111;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.ENGLISH20112;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.ENGLISH20113;
            }
            // Irish
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.IRISH)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.IRISH20110;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.IRISH20111;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.IRISH20112;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.IRISH20113;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.FRENCH)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.FRENCH20110;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.FRENCH20111;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.FRENCH20112;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.FRENCH20113;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.GERMAN)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.GERMAN20110;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.GERMAN20111;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.GERMAN20112;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.GERMAN20113;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.PHYSICS)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return null;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return null;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.PHYSICS20112;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.PHYSICS20113;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.BIOLOGY)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return null;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return null;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.BIOLOGY20112;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.BIOLOGY20113;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.CHEMISTRY)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return null;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return null;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.CHEMISTRY20112;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.CHEMISTRY20123;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.GEOGRAPHY)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.GEOGRAPHY20110;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.GEOGRAPHY20111;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.GEOGRAPHY20112;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.GEOGRAPHY20113;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.HISTORY)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.HISTORY20110;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.HISTORY20111;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.HISTORY20112;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.HISTORY20113;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.ACCOUNTING)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.ACCOUNTING20110;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.ACCOUNTING20111;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.ACCOUNTING20112;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.ACCOUNTING20113;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.ECONOMICS)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.ECONOMICS20110;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.ECONOMICS20111;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.ECONOMICS20112;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.ECONOMICS20113;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.BUSINESS)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.BUSINESS20110;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.BUSINESS20111;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.BUSINESS20112;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.BUSINESS20113;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.TECHNOLOGY)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.TECHNOLOGY20110;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.TECHNOLOGY20111;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.TECHNOLOGY20112;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.TECHNOLOGY20113;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.HOMEEC)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.HOMEEC20110;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.HOMEEC20111;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.HOMEEC20112;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.HOMEEC20113;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.RELIGION)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.RELIGION20110;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.RELIGION20111;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.RELIGION20112;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.RELIGION20113;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.METALWORK)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.METALWORK20110;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.METALWORK20111;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.METALWORK20112;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.METALWORK20113;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.WOODWORK)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.WOODWORK20110;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.WOODWORK20111;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.WOODWORK20112;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.WOODWORK20113;
            }
        }
        return null;
    }
}
