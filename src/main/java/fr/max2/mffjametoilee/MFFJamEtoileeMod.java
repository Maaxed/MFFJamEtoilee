package fr.max2.mffjametoilee;

import java.util.List;
import java.util.stream.Collectors;

import fr.max2.mffjametoilee.init.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

@Mod(MFFJamEtoileeMod.MOD_ID)
public class MFFJamEtoileeMod
{
	public static final String MOD_ID = "mffjametoilee";
	
	
	public MFFJamEtoileeMod()
	{
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		ModItems.REGISTRY.register(modEventBus);
	}
	
	public static <T extends IForgeRegistryEntry<T>> List<T> filterRegistry(IForgeRegistry<T> registry)
	{
		return registry.getValues().stream().filter(entry -> entry.getRegistryName().getNamespace().equals(MOD_ID)).collect(Collectors.toList());
	}
	
}