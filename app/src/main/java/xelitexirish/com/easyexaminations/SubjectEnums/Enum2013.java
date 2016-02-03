package xelitexirish.com.easyexaminations.SubjectEnums;

import xelitexirish.com.easyexaminations.MainActivity;

public class Enum2013 {

    MainActivity activity;

    public Enum2013(MainActivity activity){
        this.activity = activity;
    }

    public SubjectEnum getEnum(){

        if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.MATHS)) {
            // Maths
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.MATHS20130;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.MATHS20131;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.MATHS20132;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.MATHS20133;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.ENGLISH)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.ENGLISH20130;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.ENGLISH20131;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.ENGLISH20132;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.ENGLISH20133;
            }
            // Irish
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.IRISH)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.IRISH20130;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.IRISH20131;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.IRISH20132;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.IRISH20133;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.FRENCH)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.FRENCH20130;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.FRENCH20131;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.FRENCH20132;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.FRENCH20133;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.GERMAN)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.GERMAN20130;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.GERMAN20131;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.GERMAN20132;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.GERMAN20133;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.PHYSICS)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return null;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return null;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.PHYSICS20132;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.PHYSICS20133;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.BIOLOGY)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return null;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return null;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.BIOLOGY20132;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.BIOLOGY20133;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.CHEMISTRY)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return null;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return null;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.CHEMISTRY20132;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.CHEMISTRY20133;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.GEOGRAPHY)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.GEOGRAPHY20130;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.GEOGRAPHY20131;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.GEOGRAPHY20132;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.GEOGRAPHY20133;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.HISTORY)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.HISTORY20130;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.HISTORY20131;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.HISTORY20132;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.HISTORY20133;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.ACCOUNTING)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.ACCOUNTING20130;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.ACCOUNTING20131;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.ACCOUNTING20132;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.ACCOUNTING20133;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.ECONOMICS)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.ECONOMICS20130;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.ECONOMICS20131;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.ECONOMICS20132;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.ECONOMICS20133;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.BUSINESS)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.BUSINESS20130;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.BUSINESS20131;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.BUSINESS20132;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.BUSINESS20133;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.TECHNOLOGY)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.TECHNOLOGY20130;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.TECHNOLOGY20131;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.TECHNOLOGY20132;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.TECHNOLOGY20133;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.HOMEEC)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.HOMEEC20130;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.HOMEEC20131;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.HOMEEC20132;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.HOMEEC20133;
            }
        }
        
        return null;
    }
}
