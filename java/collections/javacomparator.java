class desc2 implements Comparator<Player>
    {
    public int compare(Player a,Player b)
        {
        int ret=0;
        if(a.score==b.score)
            return b.name.compareTo(a.name);
        else
            {
            if(a.score<b.score)
                ret=1;
            else
                ret=-1;
        }
        return ret;
    }
}
class Checker 
    {
    desc2 desc=new desc2();
}