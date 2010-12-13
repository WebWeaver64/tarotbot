package liberus.tarot.os.widget;

import liberus.tarot.os.activity.CardForTheDayActivity;
import liberus.utils.WebUtils;


public class TarotBotSmallWidget extends TarotBotWidget
{    
	@Override
	public String getPath() {
		return WebUtils.md5("tarotbot")+"/"+WebUtils.md5("liberus.tarot.android");
	}
	@Override
	public Class getWidgetClass() {
		return TarotBotSmallWidget.class;
	}
	@Override
	public Class getActivityClass() {
		return CardForTheDayActivity.class;
	}
}