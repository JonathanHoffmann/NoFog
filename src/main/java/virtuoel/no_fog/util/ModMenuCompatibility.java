package virtuoel.no_fog.util;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;

import me.shedaniel.autoconfig.AutoConfigClient;
import virtuoel.no_fog.NoFogClient;

public class ModMenuCompatibility implements ModMenuApi
{
	@Override
	public ConfigScreenFactory<?> getModConfigScreenFactory()
	{
		return screen -> !NoFogClient.CONFIGS_LOADED ? null : AutoConfigClient.getConfigScreen(NoFogConfigImpl.class, screen).get();
	}
}
