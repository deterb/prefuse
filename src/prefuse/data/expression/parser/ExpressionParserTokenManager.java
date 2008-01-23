/* Generated By:JavaCC: Do not edit this line. ExpressionParserTokenManager.java */
package prefuse.data.expression.parser;

public class ExpressionParserTokenManager implements ExpressionParserConstants
{
  public static  java.io.PrintStream debugStream = System.out;
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x600000000L) != 0L)
            return 71;
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private final int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private final int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private final int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 37:
         return jjStopAtPos(0, 42);
      case 40:
         return jjStopAtPos(0, 29);
      case 41:
         return jjStopAtPos(0, 30);
      case 42:
         return jjStopAtPos(0, 39);
      case 43:
         return jjStopAtPos(0, 37);
      case 44:
         return jjStopAtPos(0, 43);
      case 45:
         return jjStopAtPos(0, 38);
      case 47:
         return jjStopAtPos(0, 40);
      case 60:
         jjmatchedKind = 33;
         return jjMoveStringLiteralDfa1_0(0x400000000L);
      case 62:
         jjmatchedKind = 32;
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 94:
         return jjStopAtPos(0, 41);
      default :
         return jjMoveNfa_0(4, 0);
   }
}
static private final int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x400000000L) != 0L)
            return jjStopAtPos(1, 34);
         else if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(1, 35);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private final void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private final void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private final void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}
static private final void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}
static private final void jjCheckNAddStates(int start)
{
   jjCheckNAdd(jjnextStates[start]);
   jjCheckNAdd(jjnextStates[start + 1]);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec3 = {
   0x1ff00000fffffffeL, 0xffffffffffffc000L, 0xffffffffL, 0x600000000000000L
};
static final long[] jjbitVec4 = {
   0x0L, 0x0L, 0x0L, 0xff7fffffff7fffffL
};
static final long[] jjbitVec5 = {
   0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec6 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffL, 0x0L
};
static final long[] jjbitVec7 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0x0L, 0x0L
};
static final long[] jjbitVec8 = {
   0x3fffffffffffL, 0x0L, 0x0L, 0x0L
};
static private final int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 141;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 4:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(0, 7);
                  else if (curChar == 46)
                  {
                     if (kind > 21)
                        kind = 21;
                     jjCheckNAddStates(8, 12);
                  }
                  else if (curChar == 60)
                     jjstateSet[jjnewStateCnt++] = 71;
                  else if (curChar == 33)
                     jjstateSet[jjnewStateCnt++] = 69;
                  else if (curChar == 61)
                     jjstateSet[jjnewStateCnt++] = 67;
                  else if (curChar == 36)
                  {
                     if (kind > 26)
                        kind = 26;
                     jjCheckNAdd(65);
                  }
                  else if (curChar == 39)
                     jjCheckNAddStates(13, 15);
                  else if (curChar == 34)
                     jjCheckNAddStates(16, 18);
                  else if (curChar == 38)
                     jjstateSet[jjnewStateCnt++] = 28;
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 16)
                        kind = 16;
                     jjCheckNAddStates(19, 21);
                  }
                  else if (curChar == 48)
                  {
                     if (kind > 16)
                        kind = 16;
                     jjCheckNAddStates(22, 26);
                  }
                  else if (curChar == 61)
                  {
                     if (kind > 31)
                        kind = 31;
                  }
                  else if (curChar == 33)
                  {
                     if (kind > 14)
                        kind = 14;
                  }
                  break;
               case 28:
                  if (curChar == 38 && kind > 12)
                     kind = 12;
                  break;
               case 29:
                  if (curChar == 38)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 36:
                  if (curChar == 33 && kind > 14)
                     kind = 14;
                  break;
               case 43:
                  if (curChar == 34)
                     jjCheckNAddStates(16, 18);
                  break;
               case 44:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddStates(16, 18);
                  break;
               case 46:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddStates(16, 18);
                  break;
               case 47:
                  if (curChar == 34 && kind > 24)
                     kind = 24;
                  break;
               case 48:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(27, 30);
                  break;
               case 49:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(16, 18);
                  break;
               case 50:
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 51;
                  break;
               case 51:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAdd(49);
                  break;
               case 52:
                  if (curChar == 39)
                     jjCheckNAddStates(13, 15);
                  break;
               case 53:
                  if ((0xffffff7fffffdbffL & l) != 0L)
                     jjCheckNAddStates(13, 15);
                  break;
               case 55:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddStates(13, 15);
                  break;
               case 56:
                  if (curChar == 39 && kind > 24)
                     kind = 24;
                  break;
               case 57:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(31, 34);
                  break;
               case 58:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(13, 15);
                  break;
               case 59:
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 60;
                  break;
               case 60:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAdd(58);
                  break;
               case 62:
                  jjAddStates(35, 36);
                  break;
               case 64:
                  if (curChar != 36)
                     break;
                  if (kind > 26)
                     kind = 26;
                  jjCheckNAdd(65);
                  break;
               case 65:
                  if ((0x3ff001000000000L & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  jjCheckNAdd(65);
                  break;
               case 66:
               case 67:
                  if (curChar == 61 && kind > 31)
                     kind = 31;
                  break;
               case 68:
                  if (curChar == 61)
                     jjstateSet[jjnewStateCnt++] = 67;
                  break;
               case 69:
                  if (curChar == 61 && kind > 36)
                     kind = 36;
                  break;
               case 70:
                  if (curChar == 33)
                     jjstateSet[jjnewStateCnt++] = 69;
                  break;
               case 71:
                  if (curChar == 62 && kind > 36)
                     kind = 36;
                  break;
               case 72:
                  if (curChar == 60)
                     jjstateSet[jjnewStateCnt++] = 71;
                  break;
               case 99:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 16)
                     kind = 16;
                  jjCheckNAddStates(19, 21);
                  break;
               case 100:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 16)
                     kind = 16;
                  jjCheckNAdd(100);
                  break;
               case 101:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(101, 102);
                  break;
               case 103:
                  if (curChar != 46)
                     break;
                  if (kind > 21)
                     kind = 21;
                  jjCheckNAddStates(8, 12);
                  break;
               case 104:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 21)
                     kind = 21;
                  jjCheckNAddTwoStates(104, 105);
                  break;
               case 106:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(107);
                  break;
               case 107:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 21)
                     kind = 21;
                  jjCheckNAdd(107);
                  break;
               case 108:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(37, 39);
                  break;
               case 110:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(111);
                  break;
               case 111:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(111, 112);
                  break;
               case 113:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(0, 7);
                  break;
               case 114:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(114, 115);
                  break;
               case 115:
                  if (curChar != 46)
                     break;
                  if (kind > 21)
                     kind = 21;
                  jjCheckNAddTwoStates(116, 117);
                  break;
               case 116:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 21)
                     kind = 21;
                  jjCheckNAddTwoStates(116, 117);
                  break;
               case 118:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(119);
                  break;
               case 119:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 21)
                     kind = 21;
                  jjCheckNAdd(119);
                  break;
               case 120:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(120, 121);
                  break;
               case 122:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(123);
                  break;
               case 123:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 21)
                     kind = 21;
                  jjCheckNAdd(123);
                  break;
               case 124:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(124, 125);
                  break;
               case 125:
                  if (curChar == 46)
                     jjCheckNAddStates(40, 42);
                  break;
               case 126:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(40, 42);
                  break;
               case 128:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(129);
                  break;
               case 129:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(129, 112);
                  break;
               case 130:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(130, 131);
                  break;
               case 132:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(133);
                  break;
               case 133:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(133, 112);
                  break;
               case 134:
                  if (curChar != 48)
                     break;
                  if (kind > 16)
                     kind = 16;
                  jjCheckNAddStates(22, 26);
                  break;
               case 136:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 16)
                     kind = 16;
                  jjstateSet[jjnewStateCnt++] = 136;
                  break;
               case 137:
                  if ((0xff000000000000L & l) == 0L)
                     break;
                  if (kind > 16)
                     kind = 16;
                  jjCheckNAdd(137);
                  break;
               case 139:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(139, 102);
                  break;
               case 140:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(140, 102);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 4:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 26)
                        kind = 26;
                     jjCheckNAdd(65);
                  }
                  else if (curChar == 91)
                     jjCheckNAdd(62);
                  else if (curChar == 124)
                     jjstateSet[jjnewStateCnt++] = 34;
                  if (curChar == 110)
                     jjAddStates(43, 44);
                  else if (curChar == 78)
                     jjAddStates(45, 46);
                  else if (curChar == 116)
                     jjAddStates(47, 48);
                  else if (curChar == 84)
                     jjAddStates(49, 50);
                  else if (curChar == 120)
                     jjstateSet[jjnewStateCnt++] = 41;
                  else if (curChar == 88)
                     jjstateSet[jjnewStateCnt++] = 38;
                  else if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 32;
                  else if (curChar == 79)
                     jjstateSet[jjnewStateCnt++] = 30;
                  else if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 26;
                  else if (curChar == 65)
                     jjstateSet[jjnewStateCnt++] = 23;
                  else if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 20;
                  else if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 16;
                  else if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 12;
                  else if (curChar == 73)
                     jjstateSet[jjnewStateCnt++] = 10;
                  else if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 8;
                  else if (curChar == 70)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 0:
                  if (curChar == 69 && kind > 7)
                     kind = 7;
                  break;
               case 1:
                  if (curChar == 83)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 2:
                  if (curChar == 76)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 3:
                  if (curChar == 65)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 5:
                  if (curChar == 101 && kind > 7)
                     kind = 7;
                  break;
               case 6:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 7:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 8:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 9:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  if (curChar == 70 && kind > 9)
                     kind = 9;
                  break;
               case 11:
                  if (curChar == 73)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if (curChar == 102 && kind > 9)
                     kind = 9;
                  break;
               case 13:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 14:
                  if (curChar == 69 && kind > 11)
                     kind = 11;
                  break;
               case 15:
                  if (curChar == 83)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 16:
                  if (curChar == 76)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 17:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 18:
                  if (curChar == 101 && kind > 11)
                     kind = 11;
                  break;
               case 19:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 20:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 21:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 22:
                  if (curChar == 68 && kind > 12)
                     kind = 12;
                  break;
               case 23:
                  if (curChar == 78)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 24:
                  if (curChar == 65)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 25:
                  if (curChar == 100 && kind > 12)
                     kind = 12;
                  break;
               case 26:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 27:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 30:
                  if (curChar == 82 && kind > 13)
                     kind = 13;
                  break;
               case 31:
                  if (curChar == 79)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 32:
                  if (curChar == 114 && kind > 13)
                     kind = 13;
                  break;
               case 33:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 32;
                  break;
               case 34:
                  if (curChar == 124 && kind > 13)
                     kind = 13;
                  break;
               case 35:
                  if (curChar == 124)
                     jjstateSet[jjnewStateCnt++] = 34;
                  break;
               case 37:
                  if (curChar == 82 && kind > 15)
                     kind = 15;
                  break;
               case 38:
                  if (curChar == 79)
                     jjstateSet[jjnewStateCnt++] = 37;
                  break;
               case 39:
                  if (curChar == 88)
                     jjstateSet[jjnewStateCnt++] = 38;
                  break;
               case 40:
                  if (curChar == 114 && kind > 15)
                     kind = 15;
                  break;
               case 41:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 40;
                  break;
               case 42:
                  if (curChar == 120)
                     jjstateSet[jjnewStateCnt++] = 41;
                  break;
               case 44:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(16, 18);
                  break;
               case 45:
                  if (curChar == 92)
                     jjAddStates(51, 53);
                  break;
               case 46:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(16, 18);
                  break;
               case 53:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(13, 15);
                  break;
               case 54:
                  if (curChar == 92)
                     jjAddStates(54, 56);
                  break;
               case 55:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(13, 15);
                  break;
               case 61:
                  if (curChar == 91)
                     jjCheckNAdd(62);
                  break;
               case 62:
                  if ((0xffffffffdfffffffL & l) != 0L)
                     jjCheckNAddTwoStates(62, 63);
                  break;
               case 63:
                  if (curChar == 93 && kind > 25)
                     kind = 25;
                  break;
               case 64:
               case 65:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  jjCheckNAdd(65);
                  break;
               case 73:
                  if (curChar == 84)
                     jjAddStates(49, 50);
                  break;
               case 74:
                  if (curChar == 69 && kind > 6)
                     kind = 6;
                  break;
               case 75:
                  if (curChar == 85)
                     jjstateSet[jjnewStateCnt++] = 74;
                  break;
               case 76:
                  if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 75;
                  break;
               case 77:
                  if (curChar == 78 && kind > 10)
                     kind = 10;
                  break;
               case 78:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 77;
                  break;
               case 79:
                  if (curChar == 72)
                     jjstateSet[jjnewStateCnt++] = 78;
                  break;
               case 80:
                  if (curChar == 116)
                     jjAddStates(47, 48);
                  break;
               case 81:
                  if (curChar == 101 && kind > 6)
                     kind = 6;
                  break;
               case 82:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 81;
                  break;
               case 83:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 82;
                  break;
               case 84:
                  if (curChar == 110 && kind > 10)
                     kind = 10;
                  break;
               case 85:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 84;
                  break;
               case 86:
                  if (curChar == 104)
                     jjstateSet[jjnewStateCnt++] = 85;
                  break;
               case 87:
                  if (curChar == 78)
                     jjAddStates(45, 46);
                  break;
               case 88:
                  if (curChar == 76 && kind > 8)
                     kind = 8;
                  break;
               case 89:
                  if (curChar == 76)
                     jjstateSet[jjnewStateCnt++] = 88;
                  break;
               case 90:
                  if (curChar == 85)
                     jjstateSet[jjnewStateCnt++] = 89;
                  break;
               case 91:
                  if (curChar == 84 && kind > 14)
                     kind = 14;
                  break;
               case 92:
                  if (curChar == 79)
                     jjstateSet[jjnewStateCnt++] = 91;
                  break;
               case 93:
                  if (curChar == 110)
                     jjAddStates(43, 44);
                  break;
               case 94:
                  if (curChar == 108 && kind > 8)
                     kind = 8;
                  break;
               case 95:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 94;
                  break;
               case 96:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 95;
                  break;
               case 97:
                  if (curChar == 116 && kind > 14)
                     kind = 14;
                  break;
               case 98:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 97;
                  break;
               case 102:
                  if ((0x100000001000L & l) != 0L && kind > 20)
                     kind = 20;
                  break;
               case 105:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(57, 58);
                  break;
               case 109:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(59, 60);
                  break;
               case 112:
                  if ((0x4000000040L & l) != 0L && kind > 22)
                     kind = 22;
                  break;
               case 117:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(61, 62);
                  break;
               case 121:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(63, 64);
                  break;
               case 127:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(65, 66);
                  break;
               case 131:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(67, 68);
                  break;
               case 135:
                  if ((0x100000001000000L & l) != 0L)
                     jjCheckNAdd(136);
                  break;
               case 136:
                  if ((0x7e0000007eL & l) == 0L)
                     break;
                  if (kind > 16)
                     kind = 16;
                  jjCheckNAdd(136);
                  break;
               case 138:
                  if ((0x100000001000000L & l) != 0L)
                     jjCheckNAdd(139);
                  break;
               case 139:
                  if ((0x7e0000007eL & l) != 0L)
                     jjCheckNAddTwoStates(139, 102);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 4:
               case 65:
                  if (!jjCanMove_1(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 26)
                     kind = 26;
                  jjCheckNAdd(65);
                  break;
               case 44:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(16, 18);
                  break;
               case 53:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(13, 15);
                  break;
               case 62:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(35, 36);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 141 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   114, 115, 120, 121, 124, 125, 130, 131, 104, 105, 108, 109, 112, 53, 54, 56,
   44, 45, 47, 100, 101, 102, 135, 137, 138, 140, 102, 44, 45, 49, 47, 53,
   54, 58, 56, 62, 63, 108, 109, 112, 126, 127, 112, 96, 98, 90, 92, 83,
   86, 76, 79, 46, 48, 50, 55, 57, 59, 106, 107, 110, 111, 118, 119, 122,
   123, 128, 129, 132, 133,
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default :
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}
private static final boolean jjCanMove_1(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec4[i2] & l2) != 0L);
      case 48:
         return ((jjbitVec5[i2] & l2) != 0L);
      case 49:
         return ((jjbitVec6[i2] & l2) != 0L);
      case 51:
         return ((jjbitVec7[i2] & l2) != 0L);
      case 61:
         return ((jjbitVec8[i2] & l2) != 0L);
      default :
         if ((jjbitVec3[i1] & l1) != 0L)
            return true;
         return false;
   }
}
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null,
null, null, null, null, null, null, null, null, null, null, null, null, null, null,
null, null, "\50", "\51", null, "\76", "\74", "\74\75", "\76\75", null, "\53",
"\55", "\52", "\57", "\136", "\45", "\54", };
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xfffe771ffc1L,
};
static final long[] jjtoSkip = {
   0x3eL,
};
static protected JavaCharStream input_stream;
static private final int[] jjrounds = new int[141];
static private final int[] jjstateSet = new int[282];
static protected char curChar;
public ExpressionParserTokenManager(JavaCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}
public ExpressionParserTokenManager(JavaCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}
static public void ReInit(JavaCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private final void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 141; i-- > 0;)
      jjrounds[i] = 0x80000000;
}
static public void ReInit(JavaCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   Token t = Token.newToken(jjmatchedKind);
   t.kind = jjmatchedKind;
   String im = jjstrLiteralImages[jjmatchedKind];
   t.image = (im == null) ? input_stream.GetImage() : im;
   t.beginLine = input_stream.getBeginLine();
   t.beginColumn = input_stream.getBeginColumn();
   t.endLine = input_stream.getEndLine();
   t.endColumn = input_stream.getEndColumn();
   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

public static Token getNextToken()
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100003600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

}
