package xelitexirish.com.easyexaminations.SubjectEnums;

import xelitexirish.com.easyexaminations.MainActivity;

public class Enum2010 {

    MainActivity activity;

    public Enum2010(MainActivity activity){
        this.activity = activity;
    }

    public SubjectEnum getEnum(){
        if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.MATHS)) {
            // Maths
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.MATHS20100;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.MATHS20101;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.MATHS20102;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.MATHS20103;
            }

            // English
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.ENGLISH)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.ENGLISH20100;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.ENGLISH20101;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.ENGLISH20102;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.ENGLISH20103;
            }
            // Irish
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.IRISH)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.IRISH20100;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.IRISH20101;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.IRISH20102;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.IRISH20103;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.FRENCH)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.FRENCH20100;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.FRENCH20101;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.FRENCH20102;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.FRENCH20103;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.GERMAN)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.GERMAN20100;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.GERMAN20101;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.GERMAN20102;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.GERMAN20103;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.PHYSICS)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return null;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return null;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.PHYSICS20102;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.PHYSICS20103;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.BIOLOGY)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return null;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return null;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.BIOLOGY20102;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.BIOLOGY20103;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.CHEMISTRY)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return null;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return null;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.CHEMISTRY20102;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.CHEMISTRY20103;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.GEOGRAPHY)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.GEOGRAPHY20100;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.GEOGRAPHY20101;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.GEOGRAPHY20102;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.GEOGRAPHY20103;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.HISTORY)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.HISTORY20100;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.HISTORY20101;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.HISTORY20102;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.HISTORY20103;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.ACCOUNTING)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.ACCOUNTING20100;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.ACCOUNTING20101;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.ACCOUNTING20102;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.ACCOUNTING20103;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.ECONOMICS)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.ECONOMICS20100;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.ECONOMICS20101;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.ECONOMICS20102;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.ECONOMICS20103;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.BUSINESS)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.BUSINESS20100;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.BUSINESS20101;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.BUSINESS20102;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.BUSINESS20103;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.TECHNOLOGY)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.TECHNOLOGY20100;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.TECHNOLOGY20101;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.TECHNOLOGY20102;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.TECHNOLOGY20103;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.HOMEEC)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.HOMEEC20100;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.HOMEEC20101;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.HOMEEC20102;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.HOMEEC20103;
            }
        }  else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.RELIGION)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.RELIGION20100;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.RELIGION20101;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.RELIGION20102;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.RELIGION20103;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.METALWORK)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.METALWORK20100;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.METALWORK20101;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.METALWORK20102;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.METALWORK20103;
            }
        } else if (activity.selectedItems[activity.PLACE_SUBJECT].equals(activity.WOODWORK)) {
            if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCOL)) {
                return SubjectEnum.WOODWORK20100;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.JCHL)) {
                return SubjectEnum.WOODWORK20101;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCOL)) {
                return SubjectEnum.WOODWORK20102;
            } else if (activity.selectedItems[activity.PLACE_LEVEL].equals(activity.LCHL)) {
                return SubjectEnum.WOODWORK20103;
            }
        }
        return null;
    }
}
